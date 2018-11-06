package com.langwing.samocharge._activity._setting;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;

public class SettingSafeActivity extends BaseBackActivity implements View.OnClickListener{


    @Override
    public int getLayoutID() {
        return R.layout.activity_setting_safe;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("安全设置");
        findViewById(R.id.rl_safe_phone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_safe_phone:
                toActivity(SafePhoneActivity.class);
                break;
        }
    }
}
