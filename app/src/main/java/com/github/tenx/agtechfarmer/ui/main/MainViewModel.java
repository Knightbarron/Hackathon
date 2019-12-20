package com.github.tenx.agtechfarmer.ui.main;

import androidx.lifecycle.MutableLiveData;

import com.github.tenx.agtechfarmer.base.BaseViewModel;
import com.github.tenx.agtechfarmer.data.AppDataManager;
import com.github.tenx.agtechfarmer.data.models.UserData;
import com.github.tenx.agtechfarmer.data.models.functions.profile.MyProfileBody;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;
import timber.log.Timber;

public class MainViewModel  extends BaseViewModel implements MainViewModelHelper {
    private AppDataManager appDataManager;

    private static final String TAG = "MainViewModel";


    private MutableLiveData<List<UserData>> eventsList;



    public MainViewModel(AppDataManager appDataManager) {
        super(appDataManager);
        this.appDataManager = appDataManager;
    }



    public void uploadToken(String token){
        MyProfileBody data = new MyProfileBody();
        data.setToken(token);
        appDataManager.patchMyProfile(data).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Response<MyProfileBody>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Response<MyProfileBody> response) {
                Timber.i("Token upload Response status : "+response.code());
                Timber.i("Token upload Response  : "+response.message());
            }

            @Override
            public void onError(Throwable e) {
                    Timber.e("error token : upload : "+e.toString());
            }

            @Override
            public void onComplete()    {
                Timber.d("Completed");
            }
        });
    }





}
