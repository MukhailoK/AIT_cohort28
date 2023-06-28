package cars.test;

import cars.dao.Garage;
import cars.dao.GarageImpl;
import cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(10);
        cars = new Car[5];
        cars[0] = new Car("AA0000AA", "CLS_65", "Mercedes", 6.5, "white");
        cars[1] = new Car("AA0001AA", "GL_55", "Mercedes", 5.5, "black");
        cars[2] = new Car("AA0002AA", "GL_55", "Mercedes", 5.5, "gold");
        cars[3] = new Car("AA0003AA", "E200", "Mercedes", 2.5, "black");
        cars[4] = new Car("AA0004AA", "E200", "Mercedes-Benz", 2.0, "silver");
        for (Car c : cars) {
            garage.addCar(c);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car car = new Car("AA9999AA", "RX7", "Mazda", 3.2, "yellow");
        assertTrue(garage.addCar(car));

    }

    @Test
    void removeCar() {
        assertEquals(cars[2], garage.removeCar("AA0002AA"));
        assertNull(garage.removeCar("AA0002AA"));
        assertNull(garage.findCarByRegNumber("AA0002AA"));
    }

    @Test
    void findCarByRegNumber() {
        assertEquals(cars[1], garage.findCarByRegNumber("AA0001AA"));
        assertNull(garage.findCarByRegNumber("AA0001AE"));
    }

    @Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("E200");
        Car[] expected = {cars[3], cars[4]};
        assertArrayEquals(expected, actual);
    }


    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("Mercedes-Benz");
        Car[] expected = {cars[4]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(5, 6);
        Car[] expected = {cars[1], cars[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("black");
        Car[] expected = {cars[1], cars[3]};
        assertArrayEquals(expected, actual);

    }
}