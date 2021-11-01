package transport;

public class LogisticSea implements Creator {
    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
