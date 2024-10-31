package homeworks.homework_02;

import main.java.homeworks.homework_02.Car;
import main.java.homeworks.homework_02.Motorcycle;
import main.java.homeworks.homework_02.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarIsVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDriveMode() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedInTestDriveMode() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarSpeedInParkingMode() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedInParkingMode() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
