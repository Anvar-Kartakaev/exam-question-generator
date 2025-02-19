package org.skypro.domain.service;

import org.skypro.domain.Question;

import java.util.Set;

public interface QuestionService {

    default String getSubjectQuestion() {
        return "Вопрос по предмету: " + subjectQuestion();
    }

    String subjectQuestion();

    Set<Question> getAllQuestions();

    void addQuestion(Question question);

    void removeQuestion(Question question);

}
