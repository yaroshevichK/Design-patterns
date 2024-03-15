package behavioral.comand.headfirst.macro.command.impl;

import behavioral.comand.headfirst.macro.command.Command;
import behavioral.comand.headfirst.macro.model.TV;

public class TvOffCommand implements Command {
    TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}