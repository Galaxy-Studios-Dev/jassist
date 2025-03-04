package gsd.jassist.display;

import javax.swing.*;
import java.awt.*;

public class Theme {
    private String name;
    private Font font = new Font("new roman", Font.PLAIN, 14);
    private Font editor_font = new Font("new roman", Font.PLAIN, 16);
    private Color color1;
    private Color color2;
    private ImageIcon background;

    public Theme(String name, Color color1, Color color2) {
        this.name = name;
        this.color1 = color1;
        this.color2 = color2;
    }

    public String name() {
        return this.name;
    }

    public Font font() {
        return this.font;
    }

    public Font editorFont() { return this.editor_font; }

    public Color mainColor() {
        return this.color1;
    }

    public Color secondaryColor() {
        return this.color2;
    }

    public ImageIcon background() {
        return this.background;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setEditorFont(Font font) {
        this.editor_font = font;
    }

    public void setBackground(String path) {
        this.background = new ImageIcon(path);
    }
}
