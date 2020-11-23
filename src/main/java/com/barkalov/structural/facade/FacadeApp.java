package com.barkalov.structural.facade;

public class FacadeApp {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.load();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvdRom);

        ComputerFacade computer = new ComputerFacade();
        computer.copy();
    }
}

class ComputerFacade {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}

class Power {
    void on() {
        System.out.println("Power on");
    }
    void off() {
        System.out.println("Power off");
    }
}

class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }
    void unload() {
        data = true;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvdRom) {
        if(dvdRom.hasData()) {
            System.out.println("Copying data from dvd...");
        } else {
            System.out.println("Please, insert dvd");
        }
    }
}
