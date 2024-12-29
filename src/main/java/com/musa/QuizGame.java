package com.musa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        HashMap<String, String> quiz = new HashMap<>();
        quiz.put("What is your name?", "Musa");
        quiz.put("What is your favorite color?", "Blue");
        quiz.put("What car does Musa drive?", "Audi");
        quiz.put("Where does Musa live?", "Boksburg");
        quiz.put("What color is Musa's car color?", "Grey");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quiz Game!");
        int correctAnswer = 0;

        for(Map.Entry<String, String> entry : quiz.entrySet()) {
            System.out.println(entry.getKey());
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase(entry.getValue())) {
                System.out.println("You have successfully entered the correct answer.");
                correctAnswer++;
            }else {
                System.out.println("You have entered an incorrect answer.");
            }
        }
        System.out.println("The number of correct answers is: " + correctAnswer + " out of " + quiz.size());
        scanner.close();
    }
}
