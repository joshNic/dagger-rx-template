package com.e.refresher.network.auth;

import com.e.refresher.models.User;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApi {

    // /users/id
    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
