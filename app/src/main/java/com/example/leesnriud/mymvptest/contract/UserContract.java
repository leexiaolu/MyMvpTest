package com.example.leesnriud.mymvptest.contract;

import com.example.leesnriud.mymvptest.base.BasePersenter;
import com.example.leesnriud.mymvptest.base.BaseView;
import com.example.leesnriud.mymvptest.model.UserData;

/**
 * Created by lee.snriud on 2018/4/23.
 */

public interface UserContract {

    interface View extends BaseView<Persenter>{
        void getUserSuccess(UserData userData);
    }

    interface Persenter extends BasePersenter{
        void getUser(String username);
    }
}
