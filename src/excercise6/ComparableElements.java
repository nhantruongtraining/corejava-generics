package excercise6;

import java.util.Arrays;

public class ComparableElements<T extends Comparable> {
    private T[] array;

    public ComparableElements(T[] array) {
        this.array = array;
    }

    public ComparableElements() {
    }

    public T getHighestElement() {
        T highestElement = this.array[0];
        for (T e:this.array
             ) {
            if (e.compareTo(highestElement) > 0) {
                highestElement = e;
            }
        }
        return highestElement;
    }

    public T getSmallestElement() {
        T smallestElement = this.array[0];
        for (T e:this.array
        ) {
            if (e.compareTo(smallestElement) < 0) {
                smallestElement = e;
            }
        }
        return smallestElement;
    }
}
