import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Car {
    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }
}

class Driver {
    private String name;
    private int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void increaseDrivingExperience() {
        drivingExperience++;
    }
}

class TaxiServiceHelper {
    public static Car getRandomCar(List<Car> cars) {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }
}

public class TaxiService{
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Створення 12 машинок
        Driver driver1 = new Driver("Oleksii", 19, 1);
        Car car1 = new Car("Honda", 120, driver1, 7000, 2008);
        cars.add(car1);

        Driver driver2 = new Driver("Yaroslav", 31, 5);
        Car car2 = new Car("Lexus", 140, driver2, 18700, 2015);
        cars.add(car2);

        Driver driver3 = new Driver("Vasyl", 30, 7);
        Car car3 = new Car("Toyota", 87, driver3, 8000, 2010);
        cars.add(car3);

        Driver driver4 = new Driver("Andriy", 24, 3);
        Car car4 = new Car("Mitsubishi", 160, driver4, 13000, 2012);
        cars.add(car4);

        Driver driver5 = new Driver("Stepan", 25, 5);
        Car car5 = new Car("Mazda", 125, driver5, 7800, 2010);
        cars.add(car5);

        Driver driver6 = new Driver("Bogdan", 25, 2);
        Car car6 = new Car("Opel", 69, driver6, 1500, 2003);
        cars.add(car6);

        Driver driver7 = new Driver("Orest", 23, 4);
        Car car7 = new Car("Skoda", 98, driver7, 4000, 1998);
        cars.add(car7);

        Driver driver8 = new Driver("Oleksandr", 19, 1);
        Car car8 = new Car("Nissan", 115, driver8, 7000, 2011);
        cars.add(car8);

        Driver driver9 = new Driver("Vlad", 23, 4);
        Car car9 = new Car("Volkswagen", 137, driver9, 8000, 2012);
        cars.add(car9);

        Driver driver10 = new Driver("Vitaliy", 19, 1);
        Car car10 = new Car("Chevrolet", 135, driver10, 7000, 2005);
        cars.add(car10);

        Driver driver11 = new Driver("Stepan", 39, 5);
        Car car11 = new Car("BMW", 137, driver11, 9500, 2003);
        cars.add(car11);

        Driver driver12 = new Driver("Bohdan", 19, 7);
        Car car12 = new Car("Daewoo", 110, driver12, 8000, 2008);
        cars.add(car12);

        // Ремонт половини автопарку
        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            double increasedPower = car.getEnginePower() * 1.1;
            car.setEnginePower(increasedPower);

            Driver newDriver = new Driver("Новий водій " + (i + 1), 25, 1);
            car.setDriver(newDriver);
        }

        // Підвищення потужності та ціни кожної другої машини
        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            double increasedPower = car.getEnginePower() * 1.1;
            double increasedPrice = car.getPrice() * 1.05;
            car.setEnginePower(increasedPower);
            car.setPrice(increasedPrice);
        }

        // Перевірка досвіду водіїв та відправлення на курси
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.increaseDrivingExperience();
            }
        }

        // Випадковий вибір машинки
        Car randomCar = TaxiServiceHelper.getRandomCar(cars);
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");

        // Виведення повідомлення про прибуття водія
        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }
}