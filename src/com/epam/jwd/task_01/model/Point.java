package com.epam.jwd.task_01.model;

import java.util.Objects;

public class Point {
    private int axisX;
    private int axisY;

    public Point(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return axisX == point.axisX &&
                axisY == point.axisY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(axisX, axisY);
    }

    @Override
    public String toString() {
        return "Point{" +
                "axisX=" + axisX +
                ", axisY=" + axisY +
                '}';
    }

    public int getAxisX() {
        return axisX;
    }

    public void setAxisX(int axisX) {
        this.axisX = axisX;
    }

    public int getAxisY() {
        return axisY;
    }

    public void setAxisY(int axisY) {
        this.axisY = axisY;
    }
}
