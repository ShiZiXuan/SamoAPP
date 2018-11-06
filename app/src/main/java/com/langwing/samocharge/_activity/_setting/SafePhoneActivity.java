package com.langwing.samocharge._activity._setting;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;

public class SafePhoneActivity extends BaseBackActivity implements View.OnClickListener{

    @Override
    public int getLayoutID() {
        return R.layout.activity_safe_phone;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("手机号");
        findViewById(R.id.but_safe_phone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.but_safe_phone:
                toActivity(ChangePhoneActivity.class);
                break;
        }
    }
}
