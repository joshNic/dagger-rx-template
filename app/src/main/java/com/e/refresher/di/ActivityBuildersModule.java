package com.e.refresher.di;

import com.e.refresher.di.auth.AuthModule;
import com.e.refresher.di.auth.AuthScope;
import com.e.refresher.di.auth.AuthViewModelsModule;
import com.e.refresher.di.main.MainFragmentBuildersModule;
import com.e.refresher.di.main.MainModule;
import com.e.refresher.di.main.MainScope;
import com.e.refresher.di.main.MainViewModelsModule;
import com.e.refresher.ui.auth.AuthActivity;
import com.e.refresher.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}