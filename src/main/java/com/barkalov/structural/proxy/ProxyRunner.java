package com.barkalov.structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
//        Image image = new RealImage("/home/pictures/1.jpg");
        Image image = new ProxyImage("/home/pictures/1.jpg");
        image.display();
    }
}
