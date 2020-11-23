package com.barkalov.creational.prototype;

public class VersionControlSystemRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "My Project", "Source code");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("------------------------------------");
        System.out.println(masterClone);
    }
}
