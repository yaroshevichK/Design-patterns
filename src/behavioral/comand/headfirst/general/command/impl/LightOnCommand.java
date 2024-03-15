package behavioral.comand.headfirst.general.command.impl;

import behavioral.comand.headfirst.general.command.Command;
import behavioral.comand.headfirst.general.model.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}