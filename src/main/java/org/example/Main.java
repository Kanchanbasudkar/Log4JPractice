package org.example;

import org.apache.log4j.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("I am in main method");
        Calculation calculation = new Calculation();
        calculation.multiplication(25, 10);
        calculation.divide(25,5);
        calculation.divide(25,0);
    }
}