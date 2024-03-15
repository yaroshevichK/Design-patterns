package behavioral.comand.headfirst.general.command.impl;

import behavioral.comand.headfirst.general.command.Command;
import behavioral.comand.headfirst.general.model.CeilingFan;

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
