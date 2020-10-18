package com.wb.dao;

import com.wb.pojo.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Create By WeiBin on 2020/2/27 22:47
 */
@Mapper
public interface InsertQuestionDao {
    @Insert("insert into question values(default,#{questionStem},#{questionAnswer},1)")
    void insertQuestion(Question question);
}
