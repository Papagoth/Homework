package com.company;

import java.util.LinkedList;
import java.util.concurrent.Callable;

public class Main {


    public static void main(String[] args)
    {
        Picture picture = new Picture();
        Picture picturemain= new Picture();
        Square square = new Square();
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();
        Triangle triangle4 = new Triangle();
        Triangle triangle5 = new Triangle();
        Circle circle1 =  new Circle();
        Circle circle2 =  new Circle();
        Circle circle3 =  new Circle();
        Circle circle4 =  new Circle();
        picture.figures.add(square);
        picture.figures.add(square1);
        picture.figures.add(square2);
        picture.figures.add(square3);
        picture.figures.add(triangle1);
        picture.figures.add(triangle2);
        picture.figures.add(triangle3);
        picture.figures.add(triangle4);
        picture.figures.add(triangle5);
        picturemain.figures.add(picture);
        picturemain.figures.add(circle1);
        picturemain.figures.add(circle2);
        picturemain.figures.add(circle3);
        picturemain.figures.add(circle4);
        for(int i = 0 ;i < picturemain.figures.size();i++)
        {
            picturemain.figures.get(i).draw();
        }





    }

}
