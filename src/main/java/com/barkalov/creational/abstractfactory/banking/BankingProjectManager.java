package com.barkalov.creational.abstractfactory.banking;

import com.barkalov.creational.abstractfactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking manager manage banking project...");
    }
}
