package com.e.refresher.di.main;

import androidx.lifecycle.ViewModel;

import com.e.refresher.di.ViewModelKey;
import com.e.refresher.ui.main.posts.PostsViewModel;
import com.e.refresher.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);

}
