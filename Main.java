package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(
                ProjectConfig.class
        );

        School student = context.getBean(School.class);
        System.out.println(student);

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer age = context.getBean(int.class);
        System.out.println(age);
    }
}

