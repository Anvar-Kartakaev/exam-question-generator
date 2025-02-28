package org.skypro.domain.exam.java;

import org.skypro.domain.Question;
import org.skypro.domain.service.QuestionService;

import java.util.HashSet;
import java.util.Set;

public class JavaQuestionService extends Question implements QuestionService {
    private final Set<Question> questions;

    public JavaQuestionService(String question, String answer) {
        super(question, answer);
        questions = new HashSet<>();
    }

    public Set<Question> getAllQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public Question getRandomQuestion() {
        return questions.iterator().next();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaQuestionService that = (JavaQuestionService) o;
        return questions.equals(that.questions);
    }

    @Override
    public int hashCode() {
        return questions.hashCode();
    }

    @Override
    public String toString() {
        return "Вопрос: " + getQuestion() + "\nОтвет:" + getAnswer();
    }

    @Override
    public String subjectQuestion() {
        return "JAVA";
    }

}
