package br.com.appburgues.data.api

import br.com.appburgues.data.model.BurgerResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceAPI {
    @GET("burgers")
    suspend fun getBurgers() : List<BurgerResponse>

    @GET("burgers/{burguer_id}")
    suspend fun getBurgerById(
       @Path("burguer_id") burgerId: Int
    ) : BurgerResponse

    @GET("/find-burger/")
    suspend fun getBurgersByName(
      @Query("searchQuery")  name: String
    ): List<BurgerResponse>

}