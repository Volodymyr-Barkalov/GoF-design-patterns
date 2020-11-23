package com.barkalov.behavioral.chain;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email notifier: " + message);
    }
}
