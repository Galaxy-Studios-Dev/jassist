package gsd.jassist.display;


import gsd.jassist.utils.WindowDimension;

import javax.swing.*;
import java.util.HashMap;

public class Window extends JFrame {
    private WindowDimension dimensions;
    private JPanel background_panel;
    private Theme theme;

    public Window(String title, WindowDimension dimensions, Theme theme) {
        this.setTitle(title);
        this.setResizable(false);
        this.setLayout(null);
        this.dimensions = dimensions;
        this.theme = theme;

        HashMap<String, Integer> pos = this.dimensions.position();
        HashMap<String, Integer> size = this.dimensions.size();
        this.setBounds(pos.get("x"), pos.get("y"), size.get("w"), size.get("h"));

        this.background_panel = new JPanel();
        this.background_panel.setSize(size.get("w"), size.get("h"));
        this.background_panel.setLayout(null);

        this.add(this.background_panel);

        this.background_panel.setBackground(this.theme.mainColor());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public HashMap<String, Integer> position() {
        return this.dimensions.position();
    }

    public HashMap<String, Integer> winSize() {
        return this.dimensions.size();
    }

    public JPanel backgroundPanel() {
        return this.background_panel;
    }

    public void redraw() {
        this.background_panel.revalidate();
        this.background_panel.repaint();

        this.revalidate();
        this.repaint();
    }

    public void setPosition(HashMap<String, Integer> pos) {
        this.setLocation(pos.get("x"), pos.get("y"));
    }

    public void setSize(HashMap<String, Integer> size) {
        this.setSize(size.get("width"), size.get("height"));
    }

    public void changeTheme(Theme theme) {
        this.background_panel.setBackground(theme.mainColor());
    }
}
