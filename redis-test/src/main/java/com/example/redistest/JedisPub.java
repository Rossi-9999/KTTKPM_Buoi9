package com.example.redistest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisPub {
	
	public static void main(String[] args) {
		JedisPool jedisPool = new JedisPool("127.0.0.1");
		Jedis jPublisher = new Jedis();
		jPublisher.publish("minhieu", "LeMinhHieu");
	}

}
