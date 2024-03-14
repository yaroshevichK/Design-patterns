package behavioral.comand.headfirst.command.impl;

import behavioral.comand.headfirst.command.Command;
import behavioral.comand.headfirst.model.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}