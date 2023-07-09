package com.module.controller.easyexcel;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.compress.utils.Lists;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author: wjw
 * @date: 2022/8/10
 */
@Log4j2
public class GetDate {
    /**
     * 获取excel 导出的数据
     *
     * @return list 集合
     */
    private List<ExcelBean> getDate() {
        log.info("开始生成数据");
        Date date = new Date();
        long startTime = System.currentTimeMillis();
        List<ExcelBean> list = Lists.newArrayList();
        for (int i = 0; i < 1000000; i++) {
            ExcelBean bean = new ExcelBean();
            bean.setId(UUID.randomUUID().toString()).
                    setName("隔壁老樊" + i).
                    setAddress("北京市朝阳区酒仙桥" + i + "路").
                    setAge(i).
                    setNumber(i + 10000).
                    setHigh(1.234 * i).
                    setDistance(1.234 * i).
                    setStartTime(date).
                    setEndTime(date);
            list.add(bean);
        }
        log.info("数据生成结束，数据量={}，耗时={}ms", list.size(), System.currentTimeMillis() - startTime);
        return list;
    }
}
