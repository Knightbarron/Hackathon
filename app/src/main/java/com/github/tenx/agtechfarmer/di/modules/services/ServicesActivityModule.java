package com.github.tenx.agtechfarmer.di.modules.services;

import android.content.Context;

import androidx.lifecycle.ViewModelProviders;

import com.github.tenx.agtechfarmer.base.ViewModelFactory;
import com.github.tenx.agtechfarmer.data.AppDataManager;
import com.github.tenx.agtechfarmer.di.scopes.ActivityContext;
import com.github.tenx.agtechfarmer.di.scopes.PerActivity;
import com.github.tenx.agtechfarmer.ui.Services.ServicesActivity;
import com.github.tenx.agtechfarmer.ui.Services.ServicesViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ServicesActivityModule {
    @Provides
    @PerActivity
    @ActivityContext
    static Context provideServiceActivityModule(ServicesActivity activity){
        return activity;
    }


    @Provides
    static ServicesViewModel provideServiceViewModel(ServicesActivity servicesActivity , AppDataManager appDataManager){
        ViewModelFactory<ServicesViewModel> factory = new ViewModelFactory<>(new ServicesViewModel(appDataManager));
        return ViewModelProviders.of(servicesActivity, factory).get(ServicesViewModel.class);
    }
}
