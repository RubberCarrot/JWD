package com.epam.jwd.task01.model;

import com.epam.jwd.task01.strategy.Figure;

import java.util.Arrays;

public class MultiAngleFigure implements Figure {
    private Point[] points;

    private MultiAngleFigure(Point[] points) {
        this.points = points;
    }

    public static MultiAngleFigure createMultiAngleFigure(Point[] points){
        return new MultiAngleFigure(points);
    }

    @Override
    public void figurePropertiesStrategy(Point[] points) {
        System.out.println("Area)");
    }

    @Override
    public String toString() {
        return "MultiAngleFigure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }


    public void figurePropertiesStrategy() {

    }


}
