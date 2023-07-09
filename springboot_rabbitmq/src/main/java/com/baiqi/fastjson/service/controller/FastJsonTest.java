package com.baiqi.fastjson.service.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baiqi.fastjson.service.model.User;
import com.baiqi.fastjson.service.model.UserGroup;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjw
 */
public class FastJsonTest {
    private static final Logger log = LoggerFactory.getLogger(FastJsonTest.class);

    /**
     * java对象转 json字符串
     */
    @Test
    public void objectToJson() {
        //简单java类转json字符串
        User user = new User("dmego", "123456");
        log.info("简单java类转json字符串:{}", JSON.toJSONString(user));
        //List<Object>转json字符串
        User user1 = new User("zhangsan", "123123");
        User user2 = new User("lisi", "321321");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        ArrayList<Object> objects2 = new ArrayList<>();
        User xiaomeing = new User("xiaomeing", "4564");
        log.info("List<Object>转json字符串:{}", JSON.toJSONString(users));
        ArrayList<Object> objects1 = new ArrayList<>();
        //复杂java类转json字符串
        UserGroup userGroup = new UserGroup("userGroup", users);
        log.info("复杂java类转json字符串:{}", JSON.toJSONString(userGroup));
        JSONObject json = new JSONObject();
        json.put("username", "zhangsan");
        json.put("password", "123456");
        User user3 = json.toJavaObject(User.class);
        log.info("JSONObject转User:{}", JSON.toJSONString(user3));
        log.info("JSONObject转User:{}", JSON.toJSONString(user3));
        log.info("JSONObject-get到username:{}", json.get("username"));
        int total = (int) (51497.54 + 161659 + 20000 + 31763 + 27987);
        log.info("JSONObject-total:{}", JSON.toJSONString(total));
    }

    /**
     * json字符串转java对象
     * 注：字符串中使用双引号需要转义 (" --> \"),这里使用的是单引号
     */
    @Test
    public void jsonToObject() {
        /* json字符串转简单java对象
         * 字符串：{"password":"123456","username":"dmego"}*/
        String jsonStr1 = "{'password':'123456','username':'dmego'}";
        User user = JSON.parseObject(jsonStr1, User.class);
        System.out.println("json字符串转简单java对象:" + user.toString());
        log.info("json字符串转简单java对象:{}", JSON.parseObject(jsonStr1, User.class));
        /*
         * json字符串转List<Object>对象
         * 字符串：[{"password":"123123","username":"zhangsan"},{"password":"321321","username":"lisi"}]
         */
        String jsonStr2 = "[{'password':'123123','username':'zhangsan'},{'password':'321321','username':'lisi'}]";
        List<User> users = JSON.parseArray(jsonStr2, User.class);
        System.out.println("json字符串转List<Object>对象:" + users.toString());
        log.info("json字符串转List<Object>对象:{}", JSON.parseArray(jsonStr2, User.class));
        /*json字符串转复杂java对象
         * 字符串：{"name":"userGroup","users":[{"password":"123123","username":"zhangsan"},{"password":"321321","username":"lisi"}]}
         * */
        String jsonStr3 = "{'name':'userGroup','users':[{'password':'123123','username':'zhangsan'},{'password':'321321','username':'lisi'}]}";
        UserGroup userGroup = JSON.parseObject(jsonStr3, UserGroup.class);
        System.out.println("json字符串转复杂java对象:" + userGroup);
        log.info("json字符串转复杂java对象:{}", JSON.parseObject(jsonStr3, UserGroup.class));
    }
}
