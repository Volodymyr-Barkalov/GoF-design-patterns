package com.barkalov.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is ok.", Priority.ROUTINE);
        System.out.println("--------------");
        reportNotifier.notifyManager("Something goes wrong...", Priority.IMPORTANT);
        System.out.println("--------------");
        reportNotifier.notifyManager("Houston, we have a problems...", Priority.ASAP);
        System.out.println("--------------");
    }
}
