import transport.Creator;
import transport.LogisticRoad;
import transport.LogisticSea;
import transport.Transport;

public class Main {

    public static void main(String[] args) {

        Creator creator = new LogisticRoad();

        Transport transport = creator.createTransport();
        transport.deliver();

        creator = new LogisticSea();

        transport = creator.createTransport();
        transport.deliver();

    }

}
