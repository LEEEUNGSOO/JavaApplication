package com.multi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(
                new Course("Java", "backend", 90, 150000),
                new Course("Spring", "backend", 95, 220000),
                new Course("React", "frontend", 88, 180000),
                new Course("Vue", "frontend", 82, 160000)
        );

        System.out.println("1. 전체 강의명 출력");
//        for(Course c:courses){
//            System.out.println(c.getTitle());
//        }
        courses.stream().forEach(course -> System.out.println(course.getTitle()));
        //Consumer<Integer> action=course -> System.out.println(course);
        //action.accept(10);

        System.out.println("\n2. 90점 이상 강의만 출력");

        courses.stream().filter(course ->course.getScore()>=90 )
                .forEach(course -> System.out.println(course.getTitle()));
        // Stream<T> filter(Predicate<? super T> predicate);
        //Predicate<Integer>predicate=(course ->course>=90 );
        //System.out.println(predicate.test(100));


//        new Course("Java", "backend", 90, 150000),
//                new Course("Spring", "backend", 95, 220000),
//                new Course("React", "frontend", 88, 180000),
//                new Course("Vue", "frontend", 82, 160000)
        System.out.println("\n3. 강의명을 문자열로 변환");
        courses.stream().map(course ->course.getTitle().concat("강의") )
                .forEach(titile->System.out.println(titile));



    }
}
