package com.example.redistest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {

	public static void main(String[] args) {
		JedisPool jedisPool = new JedisPool("127.0.0.1");
		Jedis jedis = jedisPool.getResource();
		
		//Test
//		try {
//			String result = jedis.get("mykey");
//			System.out.println(result);
//
//			jedis.set("msg_java", "Hello Java");
//			jedisPool.returnResource(jedis);
//
//			String result2 = jedis.get("msg_java");
//			System.out.println(result2);
//
//		}
//		finally {
//			jedisPool.destroy();
//		}
		
		//Redis set
//		jedis.sadd("nicknames", "nickname#1");
//		jedis.sadd("nicknames", "nickname#2");
//		jedis.sadd("nicknames", "nickname#1");
//		jedis.sadd("nicknames", "nickname#3");
//		
//		jedis.spop("nicknames");
//
//		Set<String> nicknames = jedis.smembers("nicknames");
//		System.out.println(nicknames);
		
		//Redis list
//		jedis.lpush("queue#tasks", "firstTask");
//		jedis.lpush("queue#tasks", "secondTask");
//		
//		List<String> task = jedis.lrange("queue#tasks", 0, 10);
//
////		String task = jedis.rpop("queue#tasks");
//		System.out.println(task);
		
		//Redis hash
//		jedis.hset("user#1", "name", "Peter");
//		jedis.hset("user#1", "job", "politician");
//				
//		String name = jedis.hget("user#1", "name");
//		System.out.println(name);
//				
//		Map<String, String> fields = jedis.hgetAll("user#1");
//		String job = fields.get("job");
//		System.out.println(job);
//		
//		System.out.println(fields);
		
	}

}
