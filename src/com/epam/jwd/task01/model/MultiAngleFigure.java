package com.epam.jwd.task01.model;

public class MultiAngleFigure implements IFigure {
    private Point[] points;

    public MultiAngleFigure(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public void figurePropertiesStrategy() {

    }
}
