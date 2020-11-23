package com.barkalov.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        CustomLogger.getCustomLogger().addLog("First log...");
        CustomLogger.getCustomLogger().addLog("Second log...");
        CustomLogger.getCustomLogger().addLog("Third log...");

        CustomLogger.getCustomLogger().showLogs();
    }
}
