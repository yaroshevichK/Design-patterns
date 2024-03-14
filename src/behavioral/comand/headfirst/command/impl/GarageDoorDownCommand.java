package behavioral.comand.headfirst.command.impl;

import behavioral.comand.headfirst.command.Command;
import behavioral.comand.headfirst.model.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}