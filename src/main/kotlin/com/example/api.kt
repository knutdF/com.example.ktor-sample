package com.example

import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

fun main() {
   // val token: String = ""
   // val data: String = ""
    val url = "https://s3.eu-central-1.amazonaws.com/app-prod-static.warnwetter.de/v16/crowd_meldungen_overview_v2.json"

    val client = OkHttpClient()

    val JSON = "application/json; charset=utf-8".toString()

    val request = Request.Builder()

        .url(url)

        .build()

    val response = client.newCall(request).execute()

    println(response.request)
    println(response.body!!.string())

}