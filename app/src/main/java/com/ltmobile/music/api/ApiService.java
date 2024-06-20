package com.ltmobile.music.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ltmobile.music.model.Track;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

// Định nghĩa ra các Endpoint API
public interface ApiService {
    // Format GSON
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    // Build ApiService để trả về JSON (Thông qua GsonConverterFactory)
    ApiService apiService = new Retrofit.Builder()
            .baseUrl("https://example.com")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    @GET("tracks")
    Call<Track> getTrack(@Query("id") String id);
}
