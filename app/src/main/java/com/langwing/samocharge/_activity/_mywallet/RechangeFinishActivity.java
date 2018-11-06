package com.langwing.samocharge._activity._mywallet;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;

public class RechangeFinishActivity extends BaseActivity implements View.OnClickListener{


    @Override
    public int getLayoutID() {
        return R.layout.activity_rechange_finish;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("充值完成");
        findViewById(R.id.bt_back_mywallet).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_back_mywallet:
                finish();
                break;
        }
    }
}
