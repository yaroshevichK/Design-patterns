package behavioral.comand.headfirst.general.model;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name+" ceiling fan light is on high");
    }
    public void off() {
        System.out.println(name+" ceiling fan light is off");
    }
}
