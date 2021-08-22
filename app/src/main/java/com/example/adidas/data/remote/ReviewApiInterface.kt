package com.example.adidas.data.remote

import com.example.adidas.data.model.ProductModel
import com.example.adidas.data.model.ReviewModel
import retrofit2.http.GET
import retrofit2.http.Path

interface ReviewApiInterface {

    @GET("$SERVICE_API_REVIEWS/{productId}")
    suspend fun fetchProductReviews(@Path("productId") productId: String): ApiResponse<ArrayList<ReviewModel>>

    companion object {
        const val SERVICE_API_REVIEWS = "reviews"
    }
}