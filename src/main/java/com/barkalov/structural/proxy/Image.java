package com.barkalov.structural.proxy;

public interface Image {
    void display();
}

class RealImage implements Image {

    String filePath;

    public RealImage(String filePath) {
        this.filePath = filePath;
        load();
    }

    public void load() {
        System.out.println("Downloading image from " + filePath);
    }

    @Override
    public void display() {
        System.out.println("Show Image...");
    }
}

class ProxyImage implements Image {

    String filePath;
    RealImage realImage;

    public ProxyImage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(filePath);
        }
        realImage.display();
    }
}
