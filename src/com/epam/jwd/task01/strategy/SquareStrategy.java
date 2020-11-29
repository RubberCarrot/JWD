package com.epam.jwd.task01.strategy;

import com.epam.jwd.task01.model.Point;

public class SquareStrategy implements Figure {

    private SquareStrategy() {

    }

    public static SquareStrategy getInstance(){
        return SquareStrategyHolder.INSTANCE;
    }
    private static class SquareStrategyHolder {

        private static final SquareStrategy INSTANCE = new SquareStrategy();
    }

    @Override
    public void figurePropertiesStrategy(Point[] points) {
        double result;
        double a =  Math.sqrt(Math.pow(points[0].getAxisX() - points[1].getAxisX(),2) + Math.pow(points[0].getAxisY() - points[1].getAxisY(), 2));
        double b = Math.sqrt(Math.pow(points[1].getAxisX() - points[2].getAxisX(),2) + Math.pow(points[1].getAxisY() - points[2].getAxisY(), 2));
        double c =  Math.sqrt(Math.pow(points[2].getAxisX() - points[3].getAxisX(),2) + Math.pow(points[2].getAxisY() - points[3].getAxisY(), 2));
        double d =  Math.sqrt(Math.pow(points[3].getAxisX() - points[0].getAxisX(),2) + Math.pow(points[3].getAxisY() - points[0].getAxisY(), 2));
        result = a + b + c + d;
        System.out.println("Perimeter =" + result);
        double p = result/2;
        result = Math.sqrt(result*(result - a)*(result - b)*(result - c)*(result - d));
        System.out.println("Square =" + result);
    }
}
