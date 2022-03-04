package pl.flaaaxxx;

import java.util.List;

public class SendMessage implements Runnable {

    private final List<Observer> observerList;

    public SendMessage(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void run() {
        try {
            if (observerList.size() == 3) {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(100);
                    System.out.println(i);
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(100);
                    System.out.println(i);
                }
            }

            observerList.forEach(Observer::update);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
