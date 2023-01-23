package com.example.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import redis.clients.jedis.Jedis


fun Route.customerRouting() {
    val jedis = Jedis("0.0.0.0", 6451)

    route("/test") {
        get {
            val jedis = null

        }
        val value = jedis.get("mkey")
    }
}
