package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");


        double len=6;
        System.out.println("Площадь со стороной "+len + "= " + area(len));

        double a= 4;
        double b = 5;
        System.out.println("Площадь прямоугольника со сторонами "+ a+"и "+b+"= " + area1(a,b));
    }


    public static void hello(String xz) {
        System.out.println("Hello " + xz);
    }


    public static double area(double l) {
        return l*l;
    }


    public static double area1(double a, double b){
        return a*b;
    }
}