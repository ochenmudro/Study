package java_final;

import java.util.Collections;
import java.util.List;

public class Parameterized<T extends Auto> {
    public static <T extends Auto> void info(List<T> list) {
        for (T obj : list) {
            obj.autoInfo();
        }
    }

    public static <T extends Auto> void amountOfThis(T object, List<T> list) {
        int count = 0;
        for (T obj : list) {
            if (object.equals(obj))
                ++count;
        }
        System.out.println("Amount of cars like this one: " + count);
    }

    public static <T extends Auto & Comparable<? super T>> boolean binarySearch(T object, List<T> list) {
        Collections.sort(list);
        int first = 0;
        int last = list.size() - 1;
        int position = last / 2;

        while ((list.get(position).compareTo(object) != 0) && (first <= last)) {
            if (list.get(position).compareTo(object) > 0) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        return first <= last;
    }

    public static <T extends Auto & Comparable<? super T>> void max(List<T> list) {
        Collections.sort(list);
        list.get(0).autoInfo();
    }
}
