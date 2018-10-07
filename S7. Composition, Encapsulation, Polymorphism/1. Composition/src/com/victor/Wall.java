package com.victor;

public class Wall {
    private int height;
    private int width;
    private int thickness;

    public Wall(int height, int width, int thickness) {
        this.height = height;
        this.width = width;
        this.thickness = thickness;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getThickness() {
        return thickness;
    }
}
