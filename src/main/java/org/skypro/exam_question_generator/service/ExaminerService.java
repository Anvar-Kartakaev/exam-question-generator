package org.skypro.exam_question_generator.service;

import org.skypro.exam_question_generator.exam.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
