package com.example.plugins


import redis.clients.jedis.Jedis
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*


fun Application.configureUserRouting() {
   routing {
       get("/user"){
           val jedis = Jedis("0.0.0.0", 6451)

           val user =jedis.get("foo")
           if (user != null) {
               call.respondText("$user")

           }else {
               call.respondText("Key not found")
           }
       }

   }
}
