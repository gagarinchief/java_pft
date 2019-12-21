package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

    @Test
    public void test0() { //тест, когда решений для уравнения нет
        Equation e = new Equation (1, 1, 1);
        Assert.assertEquals(e.rootNumber(), 0);

    }

    @Test
    public void test1() { //тест, когда решений для уравнения 1
        Equation e = new Equation (1, 2, 1);
        Assert.assertEquals(e.rootNumber(), 1);

    }

    @Test
    public void test2() { //тест, когда решений для уравнения 2
        Equation e = new Equation (1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2);

    }

    @Test
    public void testLinear() { //тест, когда линейное уравнение
        Equation e = new Equation (0, 1, 1);
        Assert.assertEquals(e.rootNumber(), 1);

    }

    @Test
    public void testConstant() { //тест, когда уравнение вырождается в константу
        Equation e = new Equation (0, 0, 1);
        Assert.assertEquals(e.rootNumber(), 0);

    }

    @Test
    public void testZero() { //тест, когда ноль равно нулю
        Equation e = new Equation (0, 0, 0);
        Assert.assertEquals(e.rootNumber(), -1);

    }

}


