package behavioral.comand.headfirst.withundo;

import behavioral.comand.headfirst.withundo.command.impl.LightOffCommand;
import behavioral.comand.headfirst.withundo.command.impl.LightOnCommand;
import behavioral.comand.headfirst.withundo.model.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        System.out.println();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
