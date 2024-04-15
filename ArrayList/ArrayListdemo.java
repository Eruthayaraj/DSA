package ArrayList;

import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student(9191, "surya"));
        stu.add(new Student(5432, "raj"));
        stu.add(new Student(4543, "navanee"));

        System.out.println(stu);
    }
}

class Student {
    int regno;
    String name;

    public Student(int regno, String name) {
        this.regno = regno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [regno=" + regno + ", name=" + name + "]";
    }
}