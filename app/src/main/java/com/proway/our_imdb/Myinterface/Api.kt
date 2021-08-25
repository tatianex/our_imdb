package com.proway.our_imdb.Myinterface

import com.proway.our_imdb.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "451c1234ee47563ca2fb15ffdce24609",
        @Query("page") page: Int
    ) : Call<GetMoviesResponse>
}