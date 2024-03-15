package behavioral.comand.headfirst.withundo.command;

public interface Command {
    void execute();
    void undo();
}