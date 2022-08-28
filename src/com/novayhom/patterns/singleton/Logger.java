package com.novayhom.patterns.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private static volatile Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public static void log(String message){
        System.out.println(message);
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() {
        return new CloneNotSupportedException();
    }
}
