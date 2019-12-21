package ru.stqa.pft.sandbox;

public class PointDistanceSolution {
    public static double distance(Point p1, Point p2){
        double a = p1.y - p2.y;
        double b = p1.x - p2.x;
        double c = 2;
        return Math.sqrt(Math.pow(a,c) + Math.pow(b,c));
    }
    public static void main(String[] args) {

        Point p1 = new Point(10, 24); //создан объект p1
        Point p2 = new Point(14, 23); //создан объект p2
//        System.out.println("Расстояние между точками " + p1 + "и" + p2 + "= " + .distance);


    //    public double distance() {
            double a = p1.y - p2.y;
            double b = p1.x - p2.x;
            double c = 2;
        //    return Math.sqrt(((this.x - x)*(this.x-this.x)) + ((this.y - this.y) *(this.y - this.y));
        }


    }
//}
