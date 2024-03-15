package behavioral.comand.headfirst.macro.command.impl;

import behavioral.comand.headfirst.macro.command.Command;
import behavioral.comand.headfirst.macro.model.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}