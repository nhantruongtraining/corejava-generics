package exercise7;

public class ComparableElements<T extends Number> {
    private T[] array;

    public ComparableElements(T[] array) {
        this.array = array;
    }

    public T getHighestElement() {
        T highestElement = this.array[0];
        for (T e:this.array
        ) {
            if (e.doubleValue() > highestElement.doubleValue()) {
                highestElement = e;
            }
        }
        return highestElement;
    }

    public T getSmallestElement() {
        T smallestElement = this.array[0];
        for (T e:this.array
        ) {
            if (e.doubleValue() < smallestElement.doubleValue()) {
                smallestElement = e;
            }
        }
        return smallestElement;
    }

    public Double getTotal() {
        Double total = 0.0;
        for (T e:this.array
             ) {
            total += e.doubleValue();
        }
        return total;
    }

    public Double getAverage() {
        return getTotal()/this.array.length;
    }
}
