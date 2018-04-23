package com.example.leesnriud.mymvptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.leesnriud.mymvptest.contract.UserContract;
import com.example.leesnriud.mymvptest.model.UserData;
import com.example.leesnriud.mymvptest.persenter.UserPersenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements UserContract.View{

    private UserPersenter mUserPersenter;

    @BindView(R.id.et)
    EditText et;
    @BindView(R.id.tv_userdata)
    TextView tvUserdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mUserPersenter = new UserPersenter(this,this);

    }

    @OnClick(R.id.bt)
    public void onViewClicked() {
        String username = et.getText().toString();
        if(!TextUtils.isEmpty(username)){
            mUserPersenter.getUser(username);
        }else{
            Toast.makeText(this,"输入名字或ID",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void setPersenter(UserContract.Persenter persenter) {

    }

    @Override
    public void getUserSuccess(UserData userData) {
            tvUserdata.setText(userData.toString());
    }
}
