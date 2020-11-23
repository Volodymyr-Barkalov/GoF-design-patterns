package com.barkalov.creational.singleton;

public class CustomLogger {
    private static CustomLogger customLogger;
    private static String logFile = "This is log file. \n\n";

    private CustomLogger() {
    }

    public static synchronized CustomLogger getCustomLogger() {
        if (customLogger == null) {
           customLogger = new CustomLogger();
        }
        return customLogger;
    }

    public void addLog(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogs() {
        System.out.println(logFile);
    }
}
