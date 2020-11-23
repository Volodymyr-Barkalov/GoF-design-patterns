package com.barkalov.creational.factorymethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("Ruby");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("Ruby")) {
            return new RubyDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
