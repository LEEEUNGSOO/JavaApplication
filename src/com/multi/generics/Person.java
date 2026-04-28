package com.multi.generics;

public class Person <T extends  Comparable<T>> implements Comparable<Person<T>> {
    private T age;

    public Person(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person<T> other) {
        return this.age.compareTo(other.getAge());
    }

    public static void main(String[] args) {
        Person<Integer>p1=new Person<Integer>(25);
        Person<Integer>p2=new Person<Integer>(30);


    }
}
