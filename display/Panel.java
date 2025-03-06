package jassist.display;

import jassist.utils.Dimension;

import javax.swing.*;
import java.util.HashMap;

public class Panel extends JPanel {
    public Panel(Dimension dimension) {
        HashMap<String, Integer> pos = dimension.position();
        HashMap<String, Integer> size = dimension.size();

        this.setBounds(pos.get("x"), pos.get("y"), size.get("width"), size.get("height"));
        this.setLayout(null);


    }

    public void redraw() {
        this.revalidate();
        this.repaint();
    }

    public void changeTheme(Theme theme) {
        this.setBackground(theme.mainColor());
    }

    public void changeTheme(Theme theme, boolean theme_reversed) {
        if (!theme_reversed) {
            this.setBackground(theme.mainColor());
        } else {
            this.setBackground(theme.secondaryColor());
        }
    }
}
