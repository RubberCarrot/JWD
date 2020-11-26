package com.epam.jwd.task_01.app;

import com.epam.jwd.task_01.model.Point;
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
            LOGGER.info(points[i]);
            i++;
        } while(i<4);


        LOGGER.debug("finished");
    }
}
