package com.barkalov.creational.abstractfactory.webstudio;

import com.barkalov.creational.abstractfactory.ProjectManager;

public class WebStudioManager implements ProjectManager {
    public void manageProject() {
        System.out.println("Webstudio manager manage web sites creation...");
    }
}
