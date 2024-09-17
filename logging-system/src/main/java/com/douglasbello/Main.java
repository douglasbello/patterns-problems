package com.douglasbello;

import com.douglasbello.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.errorLog("Error");
        logger.successLog("Success");
    }
}