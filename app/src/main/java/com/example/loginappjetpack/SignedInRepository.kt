package com.example.loginappjetpack

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class SignedInRepository(private val requestQueue: RequestQueue) {

    fun fetchApiData(callback: (Result<ApiResponse>) -> Unit) {
        val url = "http://bimpai-api-staging-env.eba-kk3sn8cf.ap-south-1.elasticbeanstalk.com/home/landing"

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            { response ->
                try {
                    val data = response.getJSONObject("data")
                    val apiData = ApiData(
                        logoImage = data.getString("logoImage"),
                        title = data.getString("title"),
                        headline = data.getString("headline")
                    )
                    val apiResponse = ApiResponse(success = true, data = apiData)
                    callback(Result.success(apiResponse))
                } catch (e: Exception) {
                    callback(Result.failure(e))
                }
            },
            { error ->
                callback(Result.failure(error))
            }
        )

        requestQueue.add(jsonObjectRequest)
    }
}
