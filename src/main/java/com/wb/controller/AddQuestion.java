package com.wb.controller;

import com.wb.common.JsonResult;
import com.wb.pojo.Question;
import com.wb.service.InsertQuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By WeiBin on 2020/2/27 22:33
 * @author WB
 */
@RestController
@RequestMapping("/add")
@AllArgsConstructor
public class AddQuestion {
    private InsertQuestionService insertQuestionService;
    @PostMapping("/question")
    public JsonResult addQuestion(@RequestBody Question question){
        System.out.println(question.getQuestionStem()+"\t"+question.getQuestionAnswer());
        question.setQuestionType(1);
        insertQuestionService.insertQuestion(question);
        return new JsonResult();
    }
}
