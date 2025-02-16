package org.skypro.exam_question_generator.service;

import org.skypro.exam_question_generator.exam.Question;
import org.skypro.exam_question_generator.exam.java.JavaQuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> questions = new HashSet<>();
        for (int i = 0; i < amount; i++) {
            questions.add(new JavaQuestionService("Question 1", "Answer 1"));
            questions.add(new JavaQuestionService("Question 2", "Answer 2"));
            questions.add(new JavaQuestionService("Question 3", "Answer 3"));
            questions.add(new JavaQuestionService("Question 4", "Answer 4"));
            questions.add(new JavaQuestionService("Question 5", "Answer 5"));
        }
        return questions;
    }

}
