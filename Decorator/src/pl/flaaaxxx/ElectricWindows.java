package pl.flaaaxxx;

public class ElectricWindows extends CarAcessoriesDecorator {

    private final Car car;

    public ElectricWindows(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return this.car.price() + 1000;
    }

    @Override
    public String description() {
        return this.car.description() + " with electric windows";
    }
}
