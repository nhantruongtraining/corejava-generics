package excercise6;

public class Demo {
    public static void main(String[] args) {
        Car car1 = new Car("Camry 2017", "Toyota", 20000);
        Car car2 = new Car("City 2020", "Honda", 18500);
        Car car3 = new Car("Voyager 1999", "Daewoo", 11900);

        Car[] cars = {car1, car2, car3};

        ComparableElements<Car> compareableList = new ComparableElements(cars);
        System.out.println("Car with Highest value: " + compareableList.getHighestElement().toString());
        System.out.println("Car with Lowest value: " + compareableList.getSmallestElement().toString());
    }

}
