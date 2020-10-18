package com.wb.dao;

import com.wb.pojo.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Create By WeiBin on 2020/2/27 23:00
 */
@Mapper
public interface ShowQuestionDao {
    @Results(id="question",value = {
            @Result(id =true,column = "id",property = "id"),
            @Result(column = "question_stem",property = "questionStem"),
            @Result(column = "question_answer",property = "questionAnswer"),
            @Result(column = "question_type",property = "questionType")
    })
    @Select("select * from question")
    List<Question> selectAllQuestion();

    @Select("select * from question where question_stem like '%重点%'")
    @ResultMap(value="question")
    List<Question> selectImportantQuestion();

    @Select("<script> select * from question where id in"+
            "<foreach item='integer1' index='index' collection='integer1' open='(' separator=',' close=')'> #{integer1} </foreach> </script>")
    @ResultMap(value="question")
    List<Question> selectRandomQuestion(@Param("integer1")List<Integer> list) ;

}
