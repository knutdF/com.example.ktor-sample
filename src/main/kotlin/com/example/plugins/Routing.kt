package com.example.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        route("/hello", HttpMethod.Get) {
            handle {
                call.respondText("Hello")
            }
        }
    }
}
