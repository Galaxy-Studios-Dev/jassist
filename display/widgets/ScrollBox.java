package jassist.display.widgets;

import jassist.display.Theme;
import jassist.utils.Dimension;

import javax.swing.*;
import java.util.HashMap;

public class ScrollBox extends JTextArea {
    private Dimension dimension;
    private JScrollPane scroll;

    public ScrollBox(Dimension dimension) {
        this.dimension = dimension;
        HashMap<String, Integer> pos = this.dimension.position();
        HashMap<String, Integer> size = this.dimension.size();

        this.setRows(10);
        this.setColumns(40);

        this.setEditable(false);
        this.setLayout(null);

        this.scroll = new JScrollPane(this, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.scroll.setBounds(pos.get("x"), pos.get("y"), size.get("width"), size.get("height"));

    }

    public JScrollPane scrollPane() {
        return this.scroll;
    }

    public void redraw() {
        this.revalidate();
        this.repaint();
    }

    public void changeTheme(Theme theme) {
        this.setBackground(theme.mainColor());
    }
}
