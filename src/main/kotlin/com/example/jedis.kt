package com.example

import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig
import redis.clients.jedis.Pipeline

fun main() {
    val jedis = Jedis("0.0.0.0", 6451)

    jedis.set("mkey", "myvalue")

    val value = jedis.get("mkey")
    println(value)

    jedis.close()
}