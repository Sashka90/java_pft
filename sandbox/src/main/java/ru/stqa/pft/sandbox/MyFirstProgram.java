package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        Square s= new Square();
        s.l=5;





        Rectangle r=new Rectangle();
        r.a= 4;
        r.b = 5;
        System.out.println("Площадь прямоугольника со сторонами "+ r.a+"и "+r.b+"= " + area1(r));
    }


    public static void hello(String xz) {
        System.out.println("Hello " + xz);
    }


    public static double area(Square s) {
        return s.l*s.l;
    }


    public static double area1(Rectangle r){
        return r.a*r.b;
    }
}