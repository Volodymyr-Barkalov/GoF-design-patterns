package com.barkalov.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersion("Version 1.0");
        System.out.println(project);
        System.out.println("Saving current version to github...");
        github.setSave(project.save());

        System.out.println("Updating project to version 1.1");
        Thread.sleep(3000);
        project.setVersion("Version 1.1");
        System.out.println(project);

        System.out.println("Something went wrong. Rollback to previous version.");
        project.load(github.getSave());
        System.out.println(project);
    }
}
