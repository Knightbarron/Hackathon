package com.github.tenx.agtechfarmer.di.modules.services;

import com.github.tenx.agtechfarmer.ui.Services.buyEquipment.BuyEquipmentFragment;
import com.github.tenx.agtechfarmer.ui.Services.equipments.EquipmentsFragment;
import com.github.tenx.agtechfarmer.ui.Services.payments.FarmerPaymentsFragment;
import com.github.tenx.agtechfarmer.ui.Services.storage.StorageFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ServicesFragmentBuilder {

    @ContributesAndroidInjector(modules = {})
    abstract EquipmentsFragment bindEquipmentsFragment();

    @ContributesAndroidInjector(modules = {})
    abstract StorageFragment bindStorageFragment();

    @ContributesAndroidInjector
    abstract BuyEquipmentFragment bindBuyEquipmentsFragment();

    @ContributesAndroidInjector
    abstract FarmerPaymentsFragment bindFarmerPaymentsFragment();


}
