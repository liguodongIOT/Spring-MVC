package com.lgd.spark.quota

import redis.clients.jedis.{Jedis, JedisPool, JedisPoolConfig}

/**
  * Created by liguodong on 2017/2/25.
  */
object JedisConnPool {

  val config = new JedisPoolConfig()
  //最大连接数,
  config.setMaxTotal(10)
  //最大空闲连接数,
  config.setMaxIdle(5)
  //当调用borrow Object方法时，是否进行有效性检查 -->
  config.setTestOnBorrow(true)
  val pool = new JedisPool(config, "192.168.133.252", 6379)

  def getConn(): Jedis = {
    pool.getResource
  }

  def main(args: Array[String]) {
    val conn = JedisConnPool.getConn()
    val r = conn.keys("*")
    println(r)
  }
  
}
