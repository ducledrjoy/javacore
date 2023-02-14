package com.java.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Duc", 23),
                new Student(2, "Duc", 29),
                new Student(3, "Truong", 23));

        Map<String, Integer> studentMap = students
                .stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getAge,
                        Integer::min
                ));
        System.out.println(studentMap);

    }
}
