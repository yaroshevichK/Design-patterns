package behavioral.comand.headfirst.command.impl;

import behavioral.comand.headfirst.command.Command;
import behavioral.comand.headfirst.model.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}