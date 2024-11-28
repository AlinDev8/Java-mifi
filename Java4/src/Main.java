import java.util.ArrayList;
import java.util.List;

// Интерфейс наблюдателя
interface Observer {
    void update(String newText);
}

// Интерфейс наблюдаемого объекта
interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Реализация StringBuilder с паттерном Наблюдатель
class StringBuilderObserver implements Observable {
    private StringBuilder stringBuilder;
    private List<Observer> observers;

    public StringBuilderObserver() {
        this.stringBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    // Метод для добавления наблюдателя
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод для уведомления наблюдателей
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stringBuilder.toString());
        }
    }

    // Делегирование методов StringBuilder
    public StringBuilderObserver append(String str) {
        stringBuilder.append(str);
        notifyObservers();
        return this;
    }

    public StringBuilderObserver insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        notifyObservers();
        return this;
    }

    public StringBuilderObserver delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
        return this;
    }

    public StringBuilderObserver reverse() {
        stringBuilder.reverse();
        notifyObservers();
        return this;
    }

    public StringBuilderObserver replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyObservers();
        return this;
    }

    public StringBuilderObserver deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notifyObservers();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}

// Пример наблюдателя
class ConsoleObserver implements Observer {
    @Override
    public void update(String newText) {
        System.out.println("Text has changed: " + newText);
    }
}

public class Main {
    public static void main(String[] args) {
        StringBuilderObserver builder = new StringBuilderObserver();

        // Создание наблюдателя
        ConsoleObserver consoleObserver = new ConsoleObserver();

        // Добавление наблюдателя
        builder.addObserver(consoleObserver);

        // Выполнение операций
        builder.append("Hello")
                .append(" World!")
                .reverse()
                .delete(0, 5);
    }
}

