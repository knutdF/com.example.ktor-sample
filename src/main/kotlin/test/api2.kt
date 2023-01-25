package test

import io.ktor.utils.io.errors.*
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.*

fun main() {
    val client = OkHttpClient.Builder()
        .authenticator(object : Authenticator {
            @Throws(IOException::class)
            override fun authenticate(route: Route?, response: Response): Request? {
                if (response.request.header("Authorization") != null) {
                    return null // Give up, we've already attempted to authenticate.
                }

                println("Authenticating for response: $response")
                println("Challenges: ${response.challenges()}")


              val accessToken = "api_e1cunp3urvtuo17nd53198iitj.pl9821ff34vbftbkl0nvr076l2"

              //  val credential = Credentials.basic("michael.strelow", "1811997mi13CHa")
                return response.request.newBuilder()
                    .header("Authorization", "Token + $accessToken")
                    .build()
            }
        })
        .build()


        val request = Request.Builder()
            .url("https://vivira.matrixreq.com/rest/1/Vivira/cat")
            .build()

         val response = client.newCall(request).execute()

            println(response.request)
            println(response.body!!.string())


    }






