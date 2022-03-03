package pl.flaaaxxx;

public class SendManager implements Observer {

    String info;

    public SendManager(String info) {
        this.info = info;
    }

    @Override
    public void update() {
        System.out.println("Wiadomość została wysłana od: " + info);
    }

}
