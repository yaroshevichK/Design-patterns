package behavioral.comand.headfirst.command.impl;

import behavioral.comand.headfirst.command.Command;
import behavioral.comand.headfirst.model.Light;

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