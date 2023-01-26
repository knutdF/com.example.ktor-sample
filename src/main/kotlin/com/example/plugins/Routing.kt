package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import redis.clients.jedis.Jedis

fun Application.configureRouting() {
// Create an instance of the Jedis client
    val jedis = Jedis("0.0.0.0", 6451)
    // Define the routing for the GET request
    routing {
        get("/data") {
            call.respondText("data")
        }
    }
}
