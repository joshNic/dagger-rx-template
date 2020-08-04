package com.e.refresher.di.main;

import com.e.refresher.network.main.MainApi;
import com.e.refresher.ui.main.posts.PostRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostRecyclerAdapter provideAdapter(){
        return new PostRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}