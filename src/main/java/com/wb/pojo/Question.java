package com.wb.pojo;

import lombok.Data;

/**
 * Create By WeiBin on 2020/2/27 22:34
 * @author WB
 */
@Data
public class Question {
    private int id;
    /**
     * 题干
     */
    private String questionStem;
    /**
     *题目答案
     */

    private String questionAnswer;
    /**
     * 题目类型
     */
    private int questionType;

}
