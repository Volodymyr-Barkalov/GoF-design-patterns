package com.barkalov.behavioral.mediator;

public abstract class AbstractUser implements User {
    Chat chat;
    String name;

    public AbstractUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }
}
