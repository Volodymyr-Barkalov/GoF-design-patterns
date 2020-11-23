package com.barkalov.creational.abstractfactory.webstudio;

import com.barkalov.creational.abstractfactory.Developer;
import com.barkalov.creational.abstractfactory.ProjectManager;
import com.barkalov.creational.abstractfactory.ProjectTeamFactory;
import com.barkalov.creational.abstractfactory.Tester;

public class WebTeamFactory implements ProjectTeamFactory {
    public Developer createDeveloper() {
        return new RubyDeveloper();
    }

    public Tester createTester() {
        return new ManualTester();
    }

    public ProjectManager createProjectManager() {
        return new WebStudioManager();
    }
}
