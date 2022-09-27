package hashMap;

import java.util.*;

public class Student {
    private String name;
    private Integer groupNumber;
    private int[] grade;

    public Student(String name, Integer groupNumber, int[] grade) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name;
    }

    public double averageOfGrades() {
        int avg = 0;
        int c = 0;
        for (int i : this.getGrade()) {
            avg += i;
            c++;
        }
        avg = avg / c;
        return avg;
    }

    public static void byGroup(List<Student> students) {
        HashMap<Integer, List<Student>> byGroup = new HashMap<>();
        for (Student student : students) {
            Integer key = student.getGroupNumber();
            if (byGroup.containsKey(key)) {
                List<Student> list = byGroup.get(key);
                list.add(student);

            } else {
                List<Student> list = new ArrayList<>();
                list.add(student);
                byGroup.put(key, list);
            }

        }
        System.out.println(byGroup);
    }

    public static void maxGrade(List<Student> students) {
        HashMap<Integer, List<Student>> maxGrade = new HashMap<>();
        Integer key = 1;
        double max = 0;
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.averageOfGrades() > max) {
                max = student.averageOfGrades();
                list.clear();
                list.add(student);
            } else if (student.averageOfGrades() == max) {
                list.add(student);
            }
            maxGrade.put(key, list);
        }
        System.out.println(maxGrade);
    }

    public static void badGrades(List<Student> students) {
        HashMap<Integer, List<Student>> badGrades = new HashMap<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        List<Student> list4 = new ArrayList<>();
        for (Student student : students) {
            for (int i : student.getGrade())
                if (i == 2) {
                    list2.add(student);
                } else if (i == 3) {
                    list3.add(student);
                } else if (i == 4) {
                    list4.add(student);
                }
            badGrades.put(2, list2);
            badGrades.put(3, list3);
            badGrades.put(4, list4);
        }
        System.out.println("2 - have students " + badGrades.get(2) + " 3 - have students " + badGrades.get(3) +
                " 4 - have students " + badGrades.get(4));
    }

    public static void lastIn5(List<Student> students) {
        HashMap<Integer, List<Student>> lastIn5 = new HashMap<>();
        List<Student> last = new ArrayList<>();
        for (Student student : students) {
            Integer key1 = student.getGroupNumber();
            if (key1 == 5) {
                last.add(student);
            }
        }
        Student l = last.get(last.size() - 1);
        last.clear();
        last.add(l);
        lastIn5.put(1, last);
        System.out.println(lastIn5);
    }
}
