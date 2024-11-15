package com.example.dimension;

public class Dimension {

    private int height = 0;
    private int width = 0;

    public Dimension() {}

    public Dimension(Dimension dimension) {
        set(dimension);
    }

    public Dimension(int height, int width) {
        set(height, width);
    }
    
    public void set(Dimension dimension) {
        set(dimension.height, dimension.width);
    }

    public void set(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public String getPrint() {
        return "Dimension (height=" + this.height + "; width=" + this.width + ")";
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
}
