package com.barkalov.behavioral.chain;

public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notifier: " + message);
    }
}
