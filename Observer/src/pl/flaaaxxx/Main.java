package pl.flaaaxxx;

import java.util.ArrayList;
import java.util.List;

/*
    Zadanie + Element, który obserwuje,
    Zadanie nie wiadomo kiedy się skończy.
    Do zadania dodany zostaje obserwator.
    W momencie zakończenia zadania obserwator otrzymuje o tym informację

*/


public class Main {

    public static void main(String[] args) {

        List<Observer> observerList1 = new ArrayList<>();
        observerList1.add(new Obserwator("Wątek 1"));
        observerList1.add(new Obserwator("Wątek 2"));
        observerList1.add(new Obserwator("Wątek 3"));

        List<Observer> observerList2 = new ArrayList<>();
        observerList2.add(new Obserwator("Wątek 1"));
        observerList2.add(new Obserwator("Wątek 2"));

        List<Observer> observerList3 = new ArrayList<>();
        observerList3.add(new Obserwator("Wątek 2"));
        observerList3.add(new Obserwator("Wątek 3"));

        Thread sendMessage1 = new Thread(new SendMessage(observerList1));
        Thread sendMessage2 = new Thread(new SendMessage(observerList2));
        Thread sendMessage3 = new Thread(new SendMessage(observerList3));
        sendMessage1.start();
        sendMessage2.start();
        sendMessage3.start();

    }

}
