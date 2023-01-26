package com.example.plugins


import redis.clients.jedis.Jedis
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*


fun Application.configureUserRouting() {
    val keyInput = readln()!!

   routing {
       get("/user"){
           val jedis = Jedis("0.0.0.0", 6451)
         //val keyInput = readln()!!

           val user =jedis.get("$keyInput")

           if (user != null) {
               call.respondText("$user")

           }else {
               call.respondText("Key not found")
           }

       }

   }
}
