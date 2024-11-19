package com.example.sample;

import android.provider.DocumentsContract;

import com.example.sample.GetRoot.Root;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GitHubService {

    @GET("/matches/v1/recent")
            @Headers({"x-rapidapi-key: 202a87bb88msh7533b15112b9f30p1d633cjsn85b1ea636a83"})
    Call<Root> getnotes ();


//    @Headers({"x-rapidapi-host : cricbuzz-cricket.p.rapidapi.com", "x-rapidapi-key : 202a87bb88msh7533b15112b9f30p1d633cjsn85b1ea636a83"})
//    @GET("/matches/v1/recent")
//    Call<Root> getnotes();

}
