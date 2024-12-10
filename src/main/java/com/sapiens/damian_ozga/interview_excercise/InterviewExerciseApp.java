package com.sapiens.damian_ozga.interview_excercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = { "com.sapiens"})
public class InterviewExerciseApp {

    public static void main(String[] args) {
        SpringApplication.run(InterviewExerciseApp.class, args);
    }
}
