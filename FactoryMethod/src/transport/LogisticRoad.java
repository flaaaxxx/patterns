package transport;

public class LogisticRoad implements Creator {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
