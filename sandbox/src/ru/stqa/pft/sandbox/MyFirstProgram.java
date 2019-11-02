package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("HUILO ");
        hello("Grigory ");
        hello("Bird ");

        Square s = new Square(5); //создан объект
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangular r = new Rectangular(4, 6);

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }
    public static void hello(String somebody) {
         System.out.println("Putin " + somebody + "PIDOR");
    }


}
