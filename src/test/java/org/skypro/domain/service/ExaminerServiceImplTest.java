package org.skypro.domain.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Test
    void whenGetQuestionsIsNull_ThenExaminerServiceImplReturnsResults() {
        int amount = Integer.parseInt(null);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {});
    }
}