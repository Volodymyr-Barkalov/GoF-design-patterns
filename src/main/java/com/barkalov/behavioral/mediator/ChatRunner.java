package com.barkalov.behavioral.mediator;

public class ChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "John Admin");
        chat.setAdmin(admin);

        User u1 = new SimpleUser(chat, "User1");
        User u2 = new SimpleUser(chat, "User2");
        User u3 = new SimpleUser(chat, "User3");
        chat.addUserToChat(u1);
        chat.addUserToChat(u2);
        chat.addUserToChat(u3);

        u1.sendMessage("Hello");
    }
}
