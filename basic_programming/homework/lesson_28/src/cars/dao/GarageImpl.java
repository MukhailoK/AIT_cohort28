package cars.dao;

import cars.model.Car;

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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getModel().equals(model)) {
                count++;
            }
        }
        Car[] cars = new Car[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (this.cars[i].getModel().equals(model)) {
                cars[j++] = this.cars[i];
            }
        }
        return cars;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getCompany().equals(company)) {
                count++;
            }
        }
        Car[] cars = new Car[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (this.cars[i].getCompany().equals(company)) {
                cars[j++] = this.cars[i];
            }
        }
        return cars;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getEngine() >= min && cars[i].getEngine() < max) {
                count++;
            }
        }
        Car[] cars = new Car[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (this.cars[i].getEngine() >= min && this.cars[i].getEngine() < max) {
                cars[j++] = this.cars[i];
            }
        }
        return cars;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor().equals(color)) {
                count++;
            }
        }
        Car[] cars = new Car[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (this.cars[i].getColor().equals(color)) {
                cars[j++] = this.cars[i];
            }
        }
        return cars;
    }
}
