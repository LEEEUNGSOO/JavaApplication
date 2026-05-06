package com.multi.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilterSortExample {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
                new Course("Java", "backend", 90, 150000),
                new Course("Spring", "backend", 95, 220000),
                new Course("React", "frontend", 88, 180000),
                new Course("Docker", "devops", 91, 200000),
                new Course("Java", "backend", 90, 150000)
        );

    }
}
