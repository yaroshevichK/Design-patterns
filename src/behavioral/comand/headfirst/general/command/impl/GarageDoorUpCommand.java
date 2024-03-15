package behavioral.comand.headfirst.general.command.impl;

import behavioral.comand.headfirst.general.command.Command;
import behavioral.comand.headfirst.general.model.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}