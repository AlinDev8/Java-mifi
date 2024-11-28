public class Ship extends Transport implements Engine {
    private FuelType fuelType;

    public Ship(String name, String brand, FuelType fuelType) {
        super(name, brand);
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Ship is starting...");
        startEngine();
    }

    @Override
    public void stop() {
        System.out.println("Ship is stopping...");
        stopEngine();
    }

    @Override
    public void displayInfo() {
        System.out.println("Ship: " + getName() + ", Brand: " + getBrand() + ", Fuel: " + fuelType.getFuelType());
    }

    @Override
    public void startEngine() {
        System.out.println("Ship engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Ship engine stopped.");
    }
}
