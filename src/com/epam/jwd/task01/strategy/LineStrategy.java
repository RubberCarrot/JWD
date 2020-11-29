package com.epam.jwd.task01.strategy;

import com.epam.jwd.task01.model.Point;

public enum LineStrategy implements Figure {
    LINESTRATEGY;

    @Override
    public void figurePropertiesStrategy(Point[] points) {
        double result;
        result = Math.sqrt(Math.pow(points[0].getAxisX() - points[1].getAxisX(),2) + Math.pow(points[0].getAxisY() - points[1].getAxisY(), 2));
        System.out.println("Perimeter =" + result);
    }
}
