package com.epam.jwd.task01.model;

public class Square implements IFigure {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Square(Point point1, Point point2, Point point3, Point point4){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }



    @Override
    public String toString() {
        return "Square{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                '}';
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public void figurePropertiesStrategy() {
        double result;
        double a =  Math.sqrt(Math.pow(point1.getAxisX() - point2.getAxisX(),2) + Math.pow(point1.getAxisY() - point2.getAxisY(), 2));
        double b = Math.sqrt(Math.pow(point2.getAxisX() - point3.getAxisX(),2) + Math.pow(point2.getAxisY() - point3.getAxisY(), 2));
        double c =  Math.sqrt(Math.pow(point3.getAxisX() - point4.getAxisX(),2) + Math.pow(point3.getAxisY() - point4.getAxisY(), 2));
        double d =  Math.sqrt(Math.pow(point4.getAxisX() - point1.getAxisX(),2) + Math.pow(point4.getAxisY() - point1.getAxisY(), 2));
        result = a + b + c + d;
        System.out.println("Perimeter =" + result);
        double p = result/2;
        result = Math.sqrt(result*(result - a)*(result - b)*(result - c)*(result - d));
        System.out.println("Square =" + result);
    }
}
