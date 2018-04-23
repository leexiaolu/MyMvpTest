package com.example.leesnriud.mymvptest.persenter;

import android.content.Context;

import com.example.leesnriud.mymvptest.contract.UserContract;
import com.example.leesnriud.mymvptest.model.UserData;
import com.example.leesnriud.mymvptest.url.Apiservice;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lee.snriud on 2018/4/23.
 */

public class UserPersenter implements UserContract.Persenter{

    private Context mContext;
    private UserContract.View mView;

    public UserPersenter(Context mContext,UserContract.View mView){
        this.mContext = mContext;
        this.mView = mView;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }

    @Override
    public void getUser(String username) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.v2ex.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        Apiservice apiservice = retrofit.create(Apiservice.class);

        apiservice.requestUser(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserData userData) {
                        mView.getUserSuccess(userData);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
