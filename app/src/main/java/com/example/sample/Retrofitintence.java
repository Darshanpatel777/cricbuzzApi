package com.example.sample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofitintence {



    public GitHubService git()
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cricbuzz-cricket.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        return service;
    }
}
