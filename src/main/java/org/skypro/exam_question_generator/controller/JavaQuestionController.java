package org.skypro.exam_question_generator.controller;

import org.skypro.exam_question_generator.exam.Question;
import org.skypro.exam_question_generator.exam.java.JavaQuestionService;
import org.skypro.exam_question_generator.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class JavaQuestionController {
    private QuestionService service;

    @GetMapping
    public String hello() {
        return "Hello, world one!";
    }

    @GetMapping("/exam/java/add")
    public String addQuestion(String question, String answer) {
        service.addQuestion(new JavaQuestionService(question, answer));
        return "Добавлено!";
    }

    @GetMapping("/exam/java/remove")
    public String removeQuestion(Question question) {
        service.removeQuestion(question);
        return "Удалено!";
    }

    @GetMapping("/exam/java")
    public Collection<Question> getQuestions() {
        return service.getAllQuestions();
    }

}
