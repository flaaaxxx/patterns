package pl.flaaaxxx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Observer> observerList1 = new ArrayList<>();
        observerList1.add(new SendManager("Wątek 1"));
        observerList1.add(new SendManager("Wątek 2"));
        observerList1.add(new SendManager("Wątek 3"));

        List<Observer> observerList2 = new ArrayList<>();
        observerList2.add(new SendManager("Wątek 1"));
        observerList2.add(new SendManager("Wątek 2"));

        List<Observer> observerList3 = new ArrayList<>();
        observerList3.add(new SendManager("Wątek 2"));
        observerList3.add(new SendManager("Wątek 3"));

        SendMessage sendMessage1 = new SendMessage(observerList1);
        SendMessage sendMessage2 = new SendMessage(observerList2);
        SendMessage sendMessage3 = new SendMessage(observerList3);
        sendMessage1.run();
        sendMessage2.run();
        sendMessage3.run();

    }

}
