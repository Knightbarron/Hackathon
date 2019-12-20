package com.github.tenx.agtechfarmer.di.modules.auth;

import android.content.Context;

import androidx.lifecycle.ViewModelProviders;

import com.github.tenx.agtechfarmer.base.ViewModelFactory;
import com.github.tenx.agtechfarmer.data.AppDataManager;
import com.github.tenx.agtechfarmer.di.scopes.ActivityContext;
import com.github.tenx.agtechfarmer.di.scopes.PerActivity;
import com.github.tenx.agtechfarmer.ui.auth.AuthViewModel;
import com.github.tenx.agtechfarmer.ui.auth.AuthenticationActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class AuthActivityModule {


        @Provides
        @PerActivity
        @ActivityContext
        static Context provideAuthActivityModule(AuthenticationActivity activity){
            return activity;
        }


        @Provides
        static AuthViewModel provideAuthViewModel(AuthenticationActivity authenticationActivity , AppDataManager appDataManager){
            ViewModelFactory<AuthViewModel> factory = new ViewModelFactory<>(new AuthViewModel(appDataManager));
            return ViewModelProviders.of(authenticationActivity, factory).get(AuthViewModel.class);
        }
    }



