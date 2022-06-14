package by.itstep.Pomaleiko.javalesson.lesson15.model.logic;

import by.itstep.Pomaleiko.javalesson.lesson15.model.data.Car;

public class CarManager {
    public static int findExpensiveCar(Car[] cars) {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += cars[i].price;
        }

    }

    public static int calculateTotalPrice(Car car1, Car car2,
                                          Car car3, Car car4) {
        return car1.price + car2.price + car3.price + car4.price;
    }
}
