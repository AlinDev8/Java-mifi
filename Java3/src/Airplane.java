public class Airplane extends Transport implements Engine {
    private EngineType engineType;

    public Airplane(String name, String brand, EngineType engineType) {
        super(name, brand);
        this.engineType = engineType;
    }

    @Override
    public void start() {
        System.out.println("Airplane is starting...");
        startEngine();
    }

    @Override
    public void stop() {
        System.out.println("Airplane is stopping...");
        stopEngine();
    }

    @Override
    public void displayInfo() {
        System.out.println("Airplane: " + getName() + ", Brand: " + getBrand() + ", Engine: " + engineType);
    }

    @Override
    public void startEngine() {
        System.out.println("Jet engines started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Jet engines stopped.");
    }
}
