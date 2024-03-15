package behavioral.comand.headfirst.general;

import behavioral.comand.headfirst.general.command.Command;
import behavioral.comand.headfirst.general.command.impl.NoCommand;

public class RemoteControl {
    //массивы доступных команд
    Command[] onCommands;
    Command[] offCommands;


    public RemoteControl() {
        //инициализация команд
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        //сохранение команд
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //нажатие кнопки включения
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    //нажатие кнопки выключения
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
