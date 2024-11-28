public enum FuelType {
    PETROL("Petrol"),
    DIESEL("Diesel"),
    ELECTRIC("Electric");

    private final String fuelName;

    // Конструктор перечисления
    FuelType(String fuelName) {
        this.fuelName = fuelName;
    }

    // Метод для получения названия типа топлива
    public String getFuelType() {
        return fuelName;
    }
}
