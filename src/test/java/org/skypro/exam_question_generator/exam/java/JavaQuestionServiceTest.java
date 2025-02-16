package org.skypro.exam_question_generator.exam.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skypro.exam_question_generator.exam.Question;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension .class)
class JavaQuestionServiceTest {
    @Mock
    private Set<Question> questions;

    @BeforeEach
    public void setUp() {
        questions = new HashSet<>();
    }

    @Test
    public void whenAddQuestionIsNot_ThenJavaQuestionServiceReturnsResults() {
        Question question = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> question.addQuestion(question));
    }

    @Test
    public void whenAddQuestionIsExists_ThenJavaQuestionServiceReturnsResults() {
        Question question = null;
        if (question.getQuestion().toLowerCase().equalsIgnoreCase(question.getQuestion()))
            Assertions.assertDoesNotThrow(() -> question.addQuestion(question));
    }


}