package com.epam.jwd.task_01.model;

public class Line implements IFigure {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public String figureName(){
        return "Line";
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

    @Override
    public void figurePropertiesStrategy() {
        double result;
        result = Math.sqrt(Math.pow(point1.getAxisX() - point2.getAxisX(),2) + Math.pow(point1.getAxisY() - point2.getAxisY(), 2));
        System.out.println("Perimeter =" + result);;
    }
}
