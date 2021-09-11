package com.hacker.guesscolor.bean;

/**
 * Bean class for coloured shape
 * Coloured shape contains shape, colour and path of the image file
 */
public class ColouredShape {

    private String shape;
    private String colour;
    private int path; // location of the coloured shape image

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}
