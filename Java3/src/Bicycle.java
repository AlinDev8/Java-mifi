public class Bicycle extends Transport {
    public Bicycle(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void start() {
        System.out.println("Bicycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping...");
    }

    @Override
    public void displayInfo() {
        System.out.println("Bicycle: " + getName() + ", Brand: " + getBrand());
    }
}
