package behavioral.comand.headfirst.withundo;

import behavioral.comand.headfirst.withundo.command.Command;
import behavioral.comand.headfirst.withundo.command.impl.NoCommand;

public class RemoteControlWithUndo {
    //массивы доступных команд
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public RemoteControlWithUndo() {
        //инициализация команд
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

            undoCommand = noCommand;
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
        undoCommand = onCommands[slot];
    }

    //нажатие кнопки выключения
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            result.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("    ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        result.append("[undo] ")
                .append(undoCommand.getClass().getSimpleName())
                .append("\n");
        return result.toString();
    }
}
