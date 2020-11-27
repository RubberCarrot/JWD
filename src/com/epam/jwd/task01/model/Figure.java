package com.epam.jwd.task01.model;

public class Figure {
    IFigure figure;

    void getFigure(IFigure figure){
        this.figure = figure;
    }

    void executeFigurePropertiesStrategy(){
        figure.figurePropertiesStrategy();
    }
}
