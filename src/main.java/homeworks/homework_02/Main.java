package main.java.homeworks.homework_02;

public class Main {

    /*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         а). Нужно создать новый проект, со следующей структурой классов (3 отдельных класса):



         b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре))
         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    */

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Niken", 2021);

        // переопределение метода toString в классах-наследниках достойно восхищения...
        System.out.println(car);
        System.out.println(motorcycle);

        car.testDrive();
        System.out.println("Car speed after test drive: " + car.getSpeed());
        car.park();
        System.out.println("Car speed after parking: " + car.getSpeed());

        motorcycle.testDrive();
        System.out.println("Motorcycle speed after test drive: " + motorcycle.getSpeed());
        motorcycle.park();
        System.out.println("Motorcycle speed after parking: " + motorcycle.getSpeed());
    }
}