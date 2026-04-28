package com.multi;
import java.util.TreeSet;

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {

        // 점수를 기준으로 오름차순 정렬
        if (this.score > other.score) {
            return 1;
        } else if (this.score < other.score) {
            return -1;
        } else {
            // 점수가 같으면 id 기준으로 정렬
            return this.id - other.id;
        }
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', score=" + score + "}";
    }
}

public class TreeSetStudentExample {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(3, "김철수", 85));
        students.add(new Student(1, "이영희", 95));
        students.add(new Student(2, "박민수", 75));
        students.add(new Student(4, "최지훈", 85));

        System.out.println("학생 목록 - 점수 오름차순");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("가장 낮은 점수 학생");
        System.out.println(students.first());

        System.out.println();

        System.out.println("가장 높은 점수 학생");
        System.out.println(students.last());
    }
}