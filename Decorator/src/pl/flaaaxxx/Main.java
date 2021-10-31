package pl.flaaaxxx;

public class Main {

    public static void main(String[] args) {
        Car i20Car = new i20Car();
        System.out.println("i20 price: " + i20Car.price());
        System.out.println("i20 description: " + i20Car.description());

        System.out.println("---------------------------------------------------");

        Car i20withArmrester = new Armrest(i20Car);
        System.out.println("i20withArmrester price: " + i20withArmrester.price());
        System.out.println("i20withArmrester description: " + i20withArmrester.description());

        System.out.println("---------------------------------------------------");

        Car i20withElectricWindows = new ElectricWindows(i20Car);
        System.out.println("i20withElectricWindows price: " + i20withElectricWindows.price());
        System.out.println("i20withElectricWindows description: " + i20withElectricWindows.description());

        System.out.println("---------------------------------------------------");

        Car i20withElectricWindowsAndArmrest = new ElectricWindows(new Armrest(i20Car));
        System.out.println("i20withElectricWindowsAndArmrest price: " + i20withElectricWindowsAndArmrest.price());
        System.out.println("i20withElectricWindowsAndArmrest description: " + i20withElectricWindowsAndArmrest.description());

    }

}
