package org.skypro.exam_question_generator.service;

import org.skypro.exam_question_generator.exam.Question;

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
