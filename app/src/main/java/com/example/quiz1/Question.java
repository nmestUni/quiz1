package com.example.quiz1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    public String question;
    public String correctAnswer;
    public String answer2;
    public String answer3;

    public Question(String question, String correctAnswer, String ans2, String ans3, String ans4) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answer2 = ans2;
        this.answer3 = ans3;
    }

    public List<String> getAnswers() {
        List<String> list = new ArrayList<>();
        list.add(correctAnswer);
        list.add(answer2);
        list.add(answer3);
        Collections.shuffle(list);

        return list;
    }
}
