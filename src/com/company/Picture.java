package com.company;

import java.util.LinkedList;

public class Picture implements Shape{

   public LinkedList<Shape> figures= new LinkedList<>();
   public Picture(){}

    public Picture(LinkedList<Shape> figures) {
        this.figures = figures;
    }

    @Override
    public void draw() {
       for(Shape figure : figures)
       {
           figure.draw();
       }

    }
}
