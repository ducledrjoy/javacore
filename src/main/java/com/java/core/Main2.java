package com.java.core;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        /* will not work */
        List<String> names = ImmutableList.copyOf(Arrays.asList("Tho","Duc","Truong"));
        names.set(0,"Phu");

        List<Student> students = ImmutableList.copyOf(
                Arrays.asList(
                        new Student(1, "Duc", 23),
                        new Student(2, "Duc", 29),
                        new Student(3, "Truong", 23)));

        /* will not work*/
        students.set(0,new Student(1,"Phu",23));

        /* work */
        students.get(0).setName("Phu");

    }
}
