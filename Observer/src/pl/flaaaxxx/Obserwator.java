package pl.flaaaxxx;

public class Obserwator implements Observer {

    String info;

    public Obserwator(String info) {
        this.info = info;
    }

    @Override
    public void update() {
        System.out.println("Wiadomość została wysłana od: " + info);
    }

}
