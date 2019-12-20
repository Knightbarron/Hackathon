package com.github.tenx.agtechfarmer.ui.business.funcnatilies;

import com.github.tenx.agtechfarmer.base.BaseViewModel;
import com.github.tenx.agtechfarmer.data.AppDataManager;

public class BusinessFunctionViewModel extends BaseViewModel implements BusinessFunctionViewModelHelper {

    private AppDataManager appDataManager;

    public BusinessFunctionViewModel(AppDataManager appDataManager) {
        super(appDataManager);
        this.appDataManager = appDataManager;
    }

    public String getString(){
        return "LWARWAASD";
    }




}
