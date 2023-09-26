package org.example;

import java.util.List;

public class HelloWorld {
    private static final int MIN_PASSING_SCORE = 90;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello world");
        String string = "hello";
        
        List<Student> students = List.of(
            new Student("John",95),
            new Student("Mark",80),
            new Student("Susan",100)

            );

        if (students != null) {
            students.stream().filter(s->s.getScore()>MIN_PASSING_SCORE).forEach(System.out::println);
        }

       
    }
}