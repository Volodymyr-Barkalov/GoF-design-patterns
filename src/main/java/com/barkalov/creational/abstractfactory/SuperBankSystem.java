package com.barkalov.creational.abstractfactory;

import com.barkalov.creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        BankingTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager projectManager = factory.createProjectManager();

        System.out.println("Start project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
