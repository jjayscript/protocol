package com.lys.Jedis;

import redis.clients.jedis.Jedis;

public class JedisClientTest {

    public static Jedis getJedisConnection(){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        return jedis;
    }

    public static void main(String[] args) {
        Jedis jedis = JedisClientTest.getJedisConnection();
        System.out.println(jedis.get("name"));

    }
}
