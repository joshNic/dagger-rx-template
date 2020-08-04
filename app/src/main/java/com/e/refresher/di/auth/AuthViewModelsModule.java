package com.e.refresher.di.auth;

import androidx.lifecycle.ViewModel;

import com.e.refresher.di.ViewModelKey;
import com.e.refresher.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
