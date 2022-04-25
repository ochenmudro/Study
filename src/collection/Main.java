package collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "F:\\java\\cmdApp\\src\\collection\\input.txt";
        String str = readUsingFiles(fileName);
        System.out.println(str);

        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split(" ");
        int i = 1;
        for (String w : words) {
            if (map.containsKey(w)) {
                int newValue = map.get(w) + 1;
                map.replace(w, newValue);
            } else {
                map.put(w, i);
            }
        }
        int max = 0;
        for (int j : map.values()) {
            if (j > max) max = j;
        }
        for (String k : map.keySet()) {
            if (map.get(k) == max) {
                System.out.println(k + " " + max);
            }
        }
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
