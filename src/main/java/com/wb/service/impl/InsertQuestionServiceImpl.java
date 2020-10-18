package com.wb.service.impl;

import com.wb.dao.InsertQuestionDao;
import com.wb.pojo.Question;
import com.wb.service.InsertQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create By WeiBin on 2020/2/27 22:46
 */
@Service
public class InsertQuestionServiceImpl implements InsertQuestionService {
    @Resource
   private InsertQuestionDao insertQuestionDao;
    @Override
    public void insertQuestion(Question question) {
        insertQuestionDao.insertQuestion(question);
    }
}
