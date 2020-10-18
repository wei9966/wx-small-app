package com.wb.service.impl;

import com.wb.dao.ShowQuestionDao;
import com.wb.pojo.Question;
import com.wb.service.ShowQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Create By WeiBin on 2020/2/27 22:58
 */
@Service
public class ShowQuestionServiceImpl implements ShowQuestionService{
    @Resource
    private ShowQuestionDao showQuestionDao;
    @Override
    public List<Question> showAllQuestion() {
        return showQuestionDao.selectAllQuestion();
    }

    @Override
    public List<Question> showImportantQuestion() {
        return showQuestionDao.selectImportantQuestion();
    }

    @Override
    public List<Question> showRandomQuestion(List<Integer> list) {
        return showQuestionDao.selectRandomQuestion(list);
    }
}
