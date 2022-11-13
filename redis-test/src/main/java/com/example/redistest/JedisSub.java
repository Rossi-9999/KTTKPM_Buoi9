package com.example.redistest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPubSub;

public class JedisSub {
	
	public static void main(String[] args) {
		JedisPool jedisPool = new JedisPool("127.0.0.1");
		Jedis jSubscriber = new Jedis();
		jSubscriber.subscribe(new JedisPubSub() {
		    @Override
		    public void onMessage(String channel, String message) {
		        System.out.println(message);
		    }
		}, "minhieu");
	}

}
