package org.example;

import org.apache.log4j.Logger;

public class Calculation {
    Logger logger = Logger.getLogger(Calculation.class);
    public void multiplication(int x, int y){
        logger.debug("Inside multiplication method, Input received is : x = "+x+", y = "+y);
        int calculatedValue = x*y;
        logger.info("calculatedValue is : "+calculatedValue);
    }

    public void divide(int x, int y){
        logger.debug("Inside divide method, Input received is : x = "+x+", y = "+y);
        int calculatedValue = 0;
        try {
            calculatedValue = x / y;
            logger.info("calculatedValue is : "+calculatedValue);
        } catch (Exception ex){
            logger.error("Divide by 0 exception "+ex.getMessage());
        }
    }
}
