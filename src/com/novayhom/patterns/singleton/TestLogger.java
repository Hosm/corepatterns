package com.novayhom.patterns.singleton;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Logger logger1 = Logger.getInstance();

        logger.log("DEBUG : value");
        logger.log("INFO : Class");
        logger1.log("DEBUG : lol");
        logger1.log("INFO : lol");

        System.out.println(logger == logger1);
    }
}
