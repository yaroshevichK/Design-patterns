package behavioral.comand.headfirst.general.command.impl;

import behavioral.comand.headfirst.general.command.Command;
import behavioral.comand.headfirst.general.model.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}