package exercise7;

public class Demo {
    public static void main(String[] args) {
        Integer[] integerArray = {3, 9, 12, 6, 11};

        ComparableElements newArray = new ComparableElements<>(integerArray);
        System.out.println("Highest value: " + newArray.getHighestElement());
        System.out.println("Total: " + newArray.getTotal());
        System.out.println("Average: " + newArray.getAverage());

        Double[] doubleArray = {4.13, 9.99, 81.1590};
        ComparableElements numDoubleArray = new ComparableElements<>(doubleArray);
        System.out.println("Lowest value: " + numDoubleArray.getSmallestElement());
        System.out.println("Total: " + numDoubleArray.getTotal());
    }
}
