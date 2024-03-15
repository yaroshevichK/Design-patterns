package behavioral.comand.headfirst.general.model;

public class Stereo {
    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCD() {
        System.out.println(name + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(name + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(name + " stereo is set for radio");
    }

    public void setVolume(int volume) {
        System.out.println(name + " stereo volume set to " + volume);
    }
}
