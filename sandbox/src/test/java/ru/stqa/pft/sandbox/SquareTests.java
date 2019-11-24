package ru.stqa.pft.sandbox;

import org.testng.annotations.Test; // для использования коротких имен класса

public class SquareTests {

    @Test //аннотация
    public void testArea() {
        Square s = new Square(5);
        assert  s.area() == 25; // assert оценить
    }

}
