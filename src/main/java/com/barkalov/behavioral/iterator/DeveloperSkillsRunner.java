package com.barkalov.behavioral.iterator;

public class DeveloperSkillsRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven"};

        Developer dev = new Developer("John Doe", skills);
        Iterator it = dev.getIterator();
        System.out.println("Developer: " + dev.getName());
        System.out.println("Developers skills: ");
        while (it.hasNext()) {
            System.out.print(it.next().toString() + " ");
        }
    }
}
