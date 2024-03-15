package behavioral.comand.headfirst.macro;

import behavioral.comand.headfirst.macro.command.Command;
import behavioral.comand.headfirst.macro.command.impl.HottubOffCommand;
import behavioral.comand.headfirst.macro.command.impl.HottubOnCommand;
import behavioral.comand.headfirst.macro.command.impl.LightOffCommand;
import behavioral.comand.headfirst.macro.command.impl.LightOnCommand;
import behavioral.comand.headfirst.macro.command.impl.MacroCommand;
import behavioral.comand.headfirst.macro.command.impl.StereoOffCommand;
import behavioral.comand.headfirst.macro.command.impl.StereoOnCommand;
import behavioral.comand.headfirst.macro.command.impl.TvOffCommand;
import behavioral.comand.headfirst.macro.command.impl.TvOnCommand;
import behavioral.comand.headfirst.macro.model.Hottub;
import behavioral.comand.headfirst.macro.model.Light;
import behavioral.comand.headfirst.macro.model.Stereo;
import behavioral.comand.headfirst.macro.model.TV;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TvOnCommand tvOn = new TvOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TvOffCommand tvOff = new TvOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

    }
}
