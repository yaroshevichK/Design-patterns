package behavioral.comand.headfirst.macro.model;

public class TV {
    private final String location;
    int channel;

    public TV(String name) {
        this.location = name;
    }

    public void on() {
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }
}
