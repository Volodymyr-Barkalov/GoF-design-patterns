package com.barkalov.creational.abstractfactory.banking;

import com.barkalov.creational.abstractfactory.Developer;
import com.barkalov.creational.abstractfactory.ProjectManager;
import com.barkalov.creational.abstractfactory.ProjectTeamFactory;
import com.barkalov.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    public Tester createTester() {
        return new QATester();
    }

    public ProjectManager createProjectManager() {
        return new BankingProjectManager();
    }
}
