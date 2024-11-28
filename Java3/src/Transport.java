public abstract class Transport {
    private String name;
    private String brand;

    public Transport(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void displayInfo();
}

