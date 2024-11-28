public class Car extends Transport implements Engine {
    private FuelType fuelType;
    private EngineType engineType;

    public Car(String name, String brand, FuelType fuelType, EngineType engineType) {
        super(name, brand);
        this.fuelType = fuelType;
        this.engineType = engineType;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
        startEngine();
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
        stopEngine();
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getName() + ", Brand: " + getBrand() + ", Fuel: " + fuelType.getFuelType() + ", Engine: " + engineType);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
