package com.multi.stream;

import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
                new Course("Java", "backend", 90, 150000),
                new Course("Spring", "backend", 95, 220000),
                new Course("React", "frontend", 88, 180000),
                new Course("Vue", "frontend", 82, 160000)
        );

        System.out.println("1. 전체 강의명 출력");
        courses.stream().forEach(course -> System.out.println(course.getTitle()));



    }
}
