package ru.stqa.pft.sandbox;

/* Name it "Hello.java"
 * Compile it by running "javac Hello.java"
 * Run it by typing "java Hello"
 */

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World!");
        hello("user");
        hello("Alexei");



        Square s = new Square(5);
         System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(4, 6);
            System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }




//        String somebody = "World!";
//        System.out.println("Hello, " + somebody);
//
//        int l = 5;
//        int s = l * l;
//        System.out.println("Площадь квадрата со стороной " + l + " = " + (s));
//
//        System.out.println(2 + 2);
//        System.out.println(2 * 2);
//        System.out.println(2 / 2);
//        System.out.println(2 - 2);
//        System.out.println(1.0 / 2);
//        System.out.println(1 / 2.0);
//
//        System.out.println("2" + "2");
//        System.out.println("2" + 2);
//        System.out.println(2 + "2");
//
//        System.out.println(2 + 2 * 2);
//        System.out.println("2 + 2 = " + (2 + 2));
}



