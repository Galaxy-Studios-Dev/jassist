package jassist.display.widgets;

import jassist.display.Theme;
import jassist.utils.Dimension;

import javax.swing.*;
import java.util.HashMap;

public class Listing extends JButton {
    private int x;
    private int y;
    private int width;
    private int height;

    private JLabel bg;

    public Listing(Dimension dimension) {
        HashMap<String, Integer> pos = dimension.position();
        HashMap<String, Integer> size = dimension.size();

        this.setOpaque(true);
        this.setBounds(pos.get("x"), pos.get("y"), size.get("width"), size.get("height"));

        this.bg = new JLabel();
        this.bg.setBounds(5, 5, size.get("width") - 9, size.get("height") - 9);
        this.bg.setOpaque(true);

        this.add(this.bg);
        this.setLayout(null);
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public void setPosition(HashMap<String, Integer> pos) {
        this.setLocation(pos.get("x"), pos.get("y"));
    }

    public void setSize(HashMap<String, Integer> size) {
        this.setSize(size.get("width"), size.get("height"));
    }

    public void changeTheme(Theme theme) {
        this.setBackground(theme.secondaryColor());
        this.bg.setBackground(theme.mainColor());
    }
}
