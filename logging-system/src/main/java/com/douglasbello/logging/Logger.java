package com.douglasbello.logging;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void errorLog(String errorMessage) {
        System.out.println("Logging error message '" + errorMessage + "' to database...");
    }

    public void successLog(String successMessage) {
        System.out.println("Logging success message '" + successMessage + "' to database...");
    }
}