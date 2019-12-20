package com.github.tenx.agtechfarmer.di.modules.auth;


import com.github.tenx.agtechfarmer.ui.auth.login.LoginFragment;
import com.github.tenx.agtechfarmer.ui.auth.registration.RegistrationFragment;
import com.github.tenx.agtechfarmer.ui.auth.selection.SelectionUserTypeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AuthFragmentBuilder {


    @ContributesAndroidInjector(modules = {})
    abstract LoginFragment bindLoginFragment();

    @ContributesAndroidInjector(modules = {})
    abstract RegistrationFragment bindRegistrationFragment();

    @ContributesAndroidInjector
    abstract SelectionUserTypeFragment bindSelectionUserTypeFragment();


}
