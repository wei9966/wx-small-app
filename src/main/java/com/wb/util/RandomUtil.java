package com.wb.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By WeiBin on 2020/2/28 16:33
 */
public class RandomUtil {
    public static List<Integer> getRandom(){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add((int)(Math.random()*287)+1);
    }
        return list;
    }
}
