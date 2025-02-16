package org.skypro.exam_question_generator.exam.java;

import org.skypro.exam_question_generator.exam.Question;

import java.util.HashSet;
import java.util.Set;

public class JavaQuestionService extends Question {
    private final Set<Question> questions;

    public JavaQuestionService(String question, String answer) {
        super(question, answer);
        questions = new HashSet<>();
    }

    @Override
    public Set<Question> getAllQuestions() {
        return questions;
    }

    @Override
    public void addQuestion(Question question) {
        questions.add(question);
    }

    @Override
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
