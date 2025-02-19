package org.skypro.domain.service;

import org.skypro.domain.Question;
import org.skypro.domain.exam.java.JavaQuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    JavaQuestionService javaQuestionService;

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> questions = javaQuestionService.getAllQuestions().stream()
                .map(JavaQuestionService::getRandomQuestion)
                .collect(Collectors.toSet());
        return questions;
    }

}
