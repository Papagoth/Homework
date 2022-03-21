package com.company;

public class Circle  extends Figure{


    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName()+ " draw()");
    }
}
