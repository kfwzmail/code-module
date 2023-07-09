package com.module.controller.jedisRedis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * 演示redis集群操作
 *
 * @author wjw
 */
public class RedisClusterDemoTest {

    public static void main(String[] args) {
        //创建对象
        HostAndPort hostAndPort = new HostAndPort("124.221.210.173", 6379);
        JedisCluster jedisCluster = new JedisCluster(hostAndPort);
        //进行操作
        jedisCluster.set("b1", "value1");
        String value = jedisCluster.get("b1");
        System.out.println("value: " + value);
        jedisCluster.close();
    }
}
