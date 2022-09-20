package excercise6;

import java.util.Objects;

public class Car implements Comparable {
    private String model;
    private String manufacturer;
    private Integer price;

    public Car(String model, String manufacturer, Integer price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price.equals(car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public int compareTo(Object o) {
        Car comparedCar = (Car)o;
        return this.price- comparedCar.getPrice();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
