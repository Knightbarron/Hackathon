package com.github.tenx.agtechfarmer.di.modules.main;


import android.content.Context;

import androidx.lifecycle.ViewModelProviders;

import com.github.tenx.agtechfarmer.data.AppDataManager;
import com.github.tenx.agtechfarmer.di.scopes.ActivityContext;
import com.github.tenx.agtechfarmer.di.scopes.PerActivity;
import com.github.tenx.agtechfarmer.ui.main.MainActivity;
import com.github.tenx.agtechfarmer.ui.main.MainViewModel;
import com.github.tenx.agtechfarmer.base.ViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
public abstract  class MainActModule {

    @Provides
    @PerActivity
    @ActivityContext
    static Context provideMainActivityContext(MainActivity activity){
        return activity;
    }


    @Provides
    static MainViewModel provideMainViewModel(MainActivity mainActivity , AppDataManager appDataManager){
        ViewModelFactory<MainViewModel> factory = new ViewModelFactory<>(new MainViewModel(appDataManager));
        return ViewModelProviders.of(mainActivity, factory).get(MainViewModel.class);
    }
}
