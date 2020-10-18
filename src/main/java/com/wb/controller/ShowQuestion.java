package com.wb.controller;

import com.wb.common.JsonResult;
import com.wb.pojo.Question;
import com.wb.service.ShowQuestionService;
import com.wb.util.RandomUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By WeiBin on 2020/2/27 22:57
 * @author WB
 */
@RestController
@RequestMapping("/show")
@AllArgsConstructor
public class ShowQuestion {

    private ShowQuestionService showQuestionService;

    @RequestMapping("/question")
    public JsonResult showAllQuestion(){
        List<Question> questions = showQuestionService.showAllQuestion();
        return new JsonResult<>(questions);
    }

    @RequestMapping("/important")
    public JsonResult showImportantQuestion(){

        return new JsonResult<>(showQuestionService.showImportantQuestion());
    }
    /**
     *  随机5题
     */
    @RequestMapping("/random")
    public JsonResult showRandomQuestion(){
        List<Integer> random = RandomUtil.getRandom();
        return new JsonResult<>(showQuestionService.showRandomQuestion(random));
    }
}
