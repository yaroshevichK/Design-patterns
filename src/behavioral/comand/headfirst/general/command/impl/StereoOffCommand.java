package behavioral.comand.headfirst.general.command.impl;

import behavioral.comand.headfirst.general.command.Command;
import behavioral.comand.headfirst.general.model.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}