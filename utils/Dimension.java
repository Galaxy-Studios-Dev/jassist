package gsd.jassist.utils;

import java.util.HashMap;

public class Dimension {
    private int x;
    private int y;
    private int width;
    private int height;

    public WindowDimension(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public HashMap<String, Integer> size() {
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("w", width);
        temp.put("h", height);
        return temp;
    }

    public HashMap<String, Integer> position() {
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("x", this.x);
        temp.put("y", this.y);
        return temp;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
