package com.e.refresher.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.e.refresher.SessionManager;
import com.e.refresher.models.User;
import com.e.refresher.ui.auth.AuthResource;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "DaggerExample";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return sessionManager.getAuthUser();
    }
}

