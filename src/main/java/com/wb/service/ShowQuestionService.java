package com.wb.service;

import com.wb.pojo.Question;

import java.util.List;

/**
 * Create By WeiBin on 2020/2/27 22:57
 */
public interface ShowQuestionService {
    List<Question> showAllQuestion();

    List<Question> showImportantQuestion();

    List<Question> showRandomQuestion(List<Integer> list);
}
