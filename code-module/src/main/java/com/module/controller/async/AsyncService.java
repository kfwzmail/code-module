package com.module.controller.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

/**
 * @author: wjw
 * @date: 2022/8/4
 */
@Slf4j
@EnableAsync
@Service
public class AsyncService {
    @Async
    public void test1() {
        log.info("-------------线程id:{}-------------", Thread.currentThread().getId());
        log.info("-------------线程名称:{}-------------", Thread.currentThread().getName());
    }
}
