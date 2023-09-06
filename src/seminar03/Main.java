package seminar03;

import seminar03.cars.*;

/**
 * Точка входа
 * Главная программа
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\n==============================\n");

        GasCar polo = new GasCar("WolksVagen", "Polo", "blue", "sedan", 4, "auto", 1.6);

        DieselCar qashqai = new DieselCar("Nisan", "Qashqai", "white", "hatchback", 4, "auto", 2.4);

        System.out.printf("Car %s was refueled %s\n", polo.getModel(),  polo.refueling());

        System.out.printf("Car %s was refueled %s\n", qashqai.getModel(),  qashqai.refueling());

        System.out.println("\n==============================\n");

        Toyota camry = new Toyota("camry", "silver", "sedan", 4, "diesel","mechanic", 2.8);

        camry.driving();

        System.out.println("\n==============================\n");

        Wheels3 wheels3 = new Wheels3("Reliant", "Regal", "red", "sedan", "gas", "mechanic", 1.2);

        wheels3.driving();

        System.out.println("\n==============================\n");

        Man truck = new Man("TGA", "green", "diesel", "auto", 5.5);

        truck.transportingGoods();

        System.out.println("\n==============================\n");

        Bucher sweeper = new Bucher("CityCat", "white", "gas", "auto", 1.4);

        sweeper.sweepStreet();

        System.out.println("\n==============================\n");

        FlyingCar plane = new FlyingCar("Magic", "Ball", "yellow", "mini", 2, "gas", "auto", 1.8);

        plane.flying();

        System.out.println("\n==============================\n");
    }
}
