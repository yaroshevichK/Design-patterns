package structural.facade.headfirst;

public class DvdPlayer {
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing \"Raiders of the Lost Ark\"");
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped \"Raiders of the Lost Ark\"");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
}
