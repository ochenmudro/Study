package hashMap;

import java.util.*;

import static hashMap.Student.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alan", 5, new int[]{2, 7, 6, 8}));
        students.add(new Student("Dave", 3, new int[]{8, 7, 4, 3, 6}));
        students.add(new Student("Katya", 5, new int[]{9, 8, 6, 8, 7, 7}));
        students.add(new Student("Steven", 4, new int[]{8, 9, 4, 5}));
        students.add(new Student("Dora", 4, new int[]{9, 8, 6, 8, 7, 7}));

        byGroup(students);
        maxGrade(students);
        badGrades(students);
        lastIn5(students);
    }
}
