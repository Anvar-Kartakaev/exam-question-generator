package org.skypro.exam_question_generator.exam;

import org.skypro.exam_question_generator.service.QuestionService;

import java.util.Objects;

public abstract class Question implements QuestionService {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question result = (Question) o;
        if (!Objects.equals(question, result.question)) return false;
        return Objects.equals(answer, result.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return "Вопрос: " + question + "\n Ответ: " + answer;
    }
}
