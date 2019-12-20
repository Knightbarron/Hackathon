package com.github.tenx.agtechfarmer.di.modules.business.businessMain;

import android.content.Context;

import androidx.lifecycle.ViewModelProviders;

import com.github.tenx.agtechfarmer.base.ViewModelFactory;
import com.github.tenx.agtechfarmer.data.AppDataManager;
import com.github.tenx.agtechfarmer.di.scopes.ActivityContext;
import com.github.tenx.agtechfarmer.di.scopes.PerActivity;
import com.github.tenx.agtechfarmer.ui.business.main.BusinessMainActivity;
import com.github.tenx.agtechfarmer.ui.business.main.BusinessMainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BusinessMainActivityModule {

    @Provides
    @PerActivity
    @ActivityContext
    static Context provideBusinessMainActivit(BusinessMainActivity activity){
        return activity;
    }


    @Provides
    static BusinessMainViewModel provideBusinessMainViewModel(BusinessMainActivity mainActivity , AppDataManager appDataManager){
        ViewModelFactory<BusinessMainViewModel> factory = new ViewModelFactory<>(new BusinessMainViewModel(appDataManager));
        return ViewModelProviders.of(mainActivity, factory).get(BusinessMainViewModel.class);
    }

}
