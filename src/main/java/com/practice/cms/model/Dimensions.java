package com.practice.cms.model;

public class Dimensions {

    private Double width;
    private Double height;
    private Double length;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    public Double volume(){
        return this.length*this.height*this.width;
    }
}
