package com.baiqi.fastjson.service.controller;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @author wjw
 * @date 2021/8/8
 */
public class Joineron {
    @Test
    public void joiner() {
        List<String> list = Lists.newArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        /**
         * 用->字符串将list内容连接
         * 结果：one->two->three->four，不用做二次处理
         */
        String value = Joiner.on("->").join(list);
        System.out.println(value);

    }


}
