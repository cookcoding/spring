/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: RedisService.java
 * Author:   Administrator
 * Date:     2015年9月25日 上午10:11:17
 * Description: 
 */
package com.dynamo.redis.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service(value = "redisService")
public class RedisService {

	private static JedisPool pool;
	private static Jedis jedis;

	static{
		pool = new JedisPool(new JedisPoolConfig(), "127.0.0.1");
		jedis = pool.getResource();
	}
	
	public RedisService() {

	}

	/**
	 * 获取一个jedis 客户端
	 * 
	 * @return
	 */
	private Jedis getJedis() {
		if (jedis == null) {
			pool = new JedisPool(new JedisPoolConfig(), "127.0.0.1");

			jedis = pool.getResource();
		}
		return jedis;
	}

	public String set(String key, String value) {
		return this.getJedis().set(key, value);
	}

	public String get(String key) {
		return this.getJedis().get(key);
	}

	public boolean exists(String key) {
		return this.getJedis().exists(key);
	}

	public Long del(String... keys) {
		return this.getJedis().del(keys);
	}

	public String flushDB() {
		return this.getJedis().flushDB();
	}

	public Set<String> keys(String pattern) {
		return this.getJedis().keys(pattern);
	}

	public Long expire(String key, int seconds) {
		return this.getJedis().expire(key, seconds);
	}

	public String flushAll() {
		return this.getJedis().flushAll();
	}

	public String getSet(String key, String value) {
		return this.getSet(key, value);
	}

	public List<String> mget(String... keys) {
		return this.getJedis().mget(keys);
	}

	public Long setnx(String key, String value) {
		return this.getJedis().setnx(key, value);
	}

	public Long append(String key, String value) {
		return this.getJedis().append(key, value);
	}

	public List<String> hvals(String key) {
		return this.getJedis().hvals(key);
	}

	public List<String> lrange(String key, long start, long end) {
		return this.getJedis().lrange(key, start, end);
	}
	
	public long lpush(String key, String value){
		return this.getJedis().lpush(key, value);
	}
}
