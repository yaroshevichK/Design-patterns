package behavioral.comand.headfirst.macro.command.impl;

import behavioral.comand.headfirst.macro.command.Command;
import behavioral.comand.headfirst.macro.model.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}