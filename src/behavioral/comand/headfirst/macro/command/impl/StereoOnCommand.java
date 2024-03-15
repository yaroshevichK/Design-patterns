package behavioral.comand.headfirst.macro.command.impl;

import behavioral.comand.headfirst.macro.command.Command;
import behavioral.comand.headfirst.macro.model.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}