import java.util.Scanner;  // Импортируем Scanner для работы с пользовательским вводом

public class Main {
    public static void main(String[] args) {
        // Пример создания объектов с использованием FuelType
        Car car = new Car("Tesla Model S", "Tesla", FuelType.ELECTRIC, EngineType.ELECTRIC);
        Airplane airplane = new Airplane("Boeing 737", "Boeing", EngineType.INTERNAL_COMBUSTION);
        Ship ship = new Ship("Titanic", "White Star Line", FuelType.DIESEL);
        Bicycle bicycle = new Bicycle("Mountain Bike", "Giant");

        car.displayInfo();
        airplane.displayInfo();
        ship.displayInfo();
        bicycle.displayInfo();

        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для ввода с консоли
        System.out.println("Choose an action (start/stop): ");
        String action = scanner.nextLine();

        switch (action.toLowerCase()) {
            case "start":
                car.start();
                airplane.start();
                ship.start();
                bicycle.start();
                break;
            case "stop":
                car.stop();
                airplane.stop();
                ship.stop();
                bicycle.stop();
                break;
            default:
                System.out.println("Invalid action.");
        }

        scanner.close();
    }
}
