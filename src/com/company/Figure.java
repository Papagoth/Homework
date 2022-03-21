package com.company;

public abstract class Figure implements Shape {

    public void draw() {
        System.out.println(this.getClass().getSimpleName()+" - draw()");
    }


}
