package com.github.tenx.agtechfarmer.di.modules.business.businessFunctionality;

import android.content.Context;

import androidx.lifecycle.ViewModelProviders;

import com.github.tenx.agtechfarmer.base.ViewModelFactory;
import com.github.tenx.agtechfarmer.data.AppDataManager;
import com.github.tenx.agtechfarmer.di.scopes.ActivityContext;
import com.github.tenx.agtechfarmer.di.scopes.PerActivity;
import com.github.tenx.agtechfarmer.ui.business.funcnatilies.BusinessFunctionViewModel;
import com.github.tenx.agtechfarmer.ui.business.funcnatilies.BusinessFunctionalityActivity;

import dagger.Module;
import dagger.Provides;

@Module
public  abstract class BusinessFunctionalityActivityModule {

    @Provides
    @PerActivity
    @ActivityContext
    static Context provideBusinessFuncActivit(BusinessFunctionalityActivity activity){
        return activity;
    }


    @Provides
    static BusinessFunctionViewModel provideBusinessFuncViewModel(BusinessFunctionalityActivity funcActivity , AppDataManager appDataManager){
        ViewModelFactory<BusinessFunctionViewModel> factory = new ViewModelFactory<>(new BusinessFunctionViewModel(appDataManager));
        return ViewModelProviders.of(funcActivity, factory).get(BusinessFunctionViewModel.class);
    }

}
