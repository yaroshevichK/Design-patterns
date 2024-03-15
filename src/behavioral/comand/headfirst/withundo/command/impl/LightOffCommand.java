package behavioral.comand.headfirst.withundo.command.impl;

import behavioral.comand.headfirst.withundo.command.Command;
import behavioral.comand.headfirst.withundo.model.Light;

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