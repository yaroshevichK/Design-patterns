package behavioral.comand.headfirst.command.impl;

import behavioral.comand.headfirst.command.Command;
import behavioral.comand.headfirst.model.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
