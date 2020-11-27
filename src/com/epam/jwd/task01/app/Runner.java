package com.epam.jwd.task01.app;

import com.epam.jwd.task01.model.Line;
import com.epam.jwd.task01.model.Point;
//import com.epam.jwd.task01.model.Square;
import com.epam.jwd.task01.model.Square;
import com.epam.jwd.task01.model.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    final private static Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        LOGGER.debug("started");

        Point[] points = new Point[4];
        points[0] = new Point(2,5);
        points[1] = new Point(6,7);
        points[2] = new Point(7,5);
        points[3] = new Point(1,1);

        int i = 0;
        do{
            LOGGER.info(points[i].toString());
            i++;
        } while(i<4);


        Line[] lines = new Line[2];
        lines[0] = new Line(new Point(3,7), new Point(3,7));
        lines[1] = new Line(new Point(3,4), new Point(7,4));

        for(i = 0; i < lines.length; i++){
            if(lines[i].getPoint1().equals(lines[i].getPoint2())){
                LOGGER.error(lines[i].toString() + " not a " + lines[i].figureName());
            } else {
                LOGGER.info(lines[i].toString());
            }
        }



        Triangle[] triangles = new Triangle[2];
        triangles[0] = new Triangle(new Point(3,7),new Point(7,8), new Point(4,5));
        triangles[1] = new Triangle(new Point(2,2), new Point(3,7), new Point(3,7));

        for (Triangle triangle : triangles) {
            if(!(triangle.getPoint1().equals(triangle.getPoint2()))){
                if(!(triangle.getPoint2().equals(triangle.getPoint3()))){
                    if(!(triangle.getPoint3().equals(triangle.getPoint1()))){
                        LOGGER.info(triangle.toString());
                        continue;
                    }
                }
            }
            LOGGER.error(triangle.toString() + " not a triangle");
        }


        Square[] squares = new Square[1];
        squares[0] = new Square(new Point(2,3), new Point(5,4), new Point(7,1), new Point(5,5));

        for (Square square : squares) {
            if (!(square.getPoint1().equals(square.getPoint2()))) {
                if (!(square.getPoint2().equals(square.getPoint3()))) {
                    if (!(square.getPoint3().equals(square.getPoint4()))) {
                        if (!(square.getPoint4().equals(square.getPoint1()))) {
                            LOGGER.info(square.toString());
                            continue;
                        }
                    }
                }
            }
            LOGGER.error(square.toString() + " not a square");
        }






        LOGGER.debug("finished");
    }
}
