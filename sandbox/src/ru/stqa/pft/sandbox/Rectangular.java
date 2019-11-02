package ru.stqa.pft.sandbox;

public class Rectangular {
    public double a; //прямоугольник описывается двумя переменными a, b
    public double b;

    public Rectangular (double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double area() {
        return this.a * this.b;

    }
}
