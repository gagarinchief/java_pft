package ru.stqa.pft.sandbox;

public class Square {
    public double l; //квадрат описывается длиной его стороны

    public Square(double len) {
    this.l = len;
    }
    public double area() {
        return this.l * this.l;
    }
}
