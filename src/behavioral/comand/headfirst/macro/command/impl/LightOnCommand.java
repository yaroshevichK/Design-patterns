package behavioral.comand.headfirst.macro.command.impl;

import behavioral.comand.headfirst.macro.command.Command;
import behavioral.comand.headfirst.macro.model.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}