package com.module.controller;

import com.alibaba.fastjson.JSON;
import com.module.model.ResponseObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wjw
 * @date: 2023/8/2
 */
@Slf4j
@RestController
@RequestMapping("/augustActivity")
public class AugustActivityController {
    @PostMapping("/queryStActivity")
    public ResponseObj queryStActivity(@RequestBody String s) {
        log.info("augustActivity接口入参：{}", JSON.toJSONString(s));
        String result = "测试接口2";
        return ResponseObj.SUCCESS(s);
    }
}
