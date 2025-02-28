package org.skypro.domain.controller;

import org.skypro.domain.Question;
import org.skypro.domain.service.QuestionService;
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
    public Question addQuestion(String question, String answer) {
        return new Question(question, answer);
    }

    @GetMapping("/exam/java/remove")
    public Question removeQuestion(Question question) {
        service.removeQuestion(question);
        return question;
    }

    @GetMapping("/exam/java")
    public Collection<Question> getQuestions() {
        return service.getAllQuestions();
    }

}
