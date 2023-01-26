package com.example


import okhttp3.OkHttpClient
import okhttp3.Request


fun main() {
   // val token: String = ""
   // val data: String = ""
    val url = "https://vivira.matrixreq.com/rest/1/project/configcheck"

    val client = OkHttpClient()

    val JSON = "application/json; charset=utf-8".toString()

    val request = Request.Builder()

        .url(url)

        .build()

    val response = client.newCall(request).execute()

    println(response.request)
    println(response.body!!.string())

}