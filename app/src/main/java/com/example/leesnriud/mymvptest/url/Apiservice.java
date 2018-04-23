package com.example.leesnriud.mymvptest.url;

import com.example.leesnriud.mymvptest.model.UserData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lee.snriud on 2018/4/23.
 */

//https://www.v2ex.com/api/

public interface Apiservice {
    @GET("members/show.json")
    Observable<UserData> requestUser(@Query("username") String username);
}
