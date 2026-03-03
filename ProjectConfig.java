package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig {
    @Bean
    School Price() {
        var student = new School();
        student.setName("Oke");
        return  student;

    }

    @Bean
    String Church() {
        return "DLBC";
    }

    @Bean
    int Age() {
        return 30;
    }
}
































//@Configuration
//public class ProjectConfig {
//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Oke");
//        return p;
//    }
//}