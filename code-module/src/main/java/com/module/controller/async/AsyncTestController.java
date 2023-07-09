package com.module.controller.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wjw
 * @date: 2022/8/5
 */
@RestController
@RequestMapping(value = "asyncTest")
public class AsyncTestController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("asyncTest1")
    public void asyncTest1() {
        asyncService.test1();
        asyncService.test1();
        asyncService.test1();
        asyncService.test1();
        asyncService.test1();
    }

}
