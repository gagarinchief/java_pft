package ru.stqa.pft.sandbox;

public class Equation {

    private final double a;
    private final double b;
    private final double c;

    private int n; //присвоение значения дискриминанта в этот атрибут

    public Equation(double a, double b, double c) { // создан конструктор

        this.a = a; //присвоение параметра в одноименное поле
        this.b = b; //присвоение параметра в одноименное поле
        this.c = c; //присвоение параметра в одноименное поле

        double discriminant = b * b - 4 * a * c; //формула дискриминанта

        if (a != 0) {
            if (discriminant > 0) {             //  количество корней уравнения
                n = 2;
            } else if (discriminant == 0) {
                n = 1;
            } else {
                n = 0;
            }

        } else if (b != 0) {
            n = 1;

        } else if (c != 0) {
          n = 0;

        } else {
          n = -1;

            }
    }

        public int rootNumber(){ // функция, которая позволяет получить значение атрибута
            return n;
        }
    }