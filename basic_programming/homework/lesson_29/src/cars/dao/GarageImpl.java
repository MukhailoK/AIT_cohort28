package cars.dao;

import cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    private boolean isPresent(Car car) {
        if (car != null) {
            for (Car c : cars) {
                if (car.equals(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addCar(Car car) {
        if (cars.length > size && car != null && !isPresent(car)) {
            cars[size] = car;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public Car removeCar(String regNumber) {
        Car car = findCarByRegNumber(regNumber);
        if (isPresent(car)) {
            for (int i = 0, j = 0; i < size; i++) {
                if (cars[i].equals(car)) {
                    cars[i] = null;
                    size--;
                } else {
                    cars[j] = cars[i];
                    j++;
                }
            }
        }
        return car;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        Car car = null;
        for (Car c : cars) {
            if (c != null
                    && c.getRegNumber().equals(regNumber)) {
                car = c;
            }
        }
        return car;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(c -> c.getModel().equals(model));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(c -> c.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(c -> c.getEngine() >= min
                && c.getEngine() <= max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(c -> c.getColor().equals(color));
    }

    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j++] = cars[i];
            }
        }
        return res;
    }
}
