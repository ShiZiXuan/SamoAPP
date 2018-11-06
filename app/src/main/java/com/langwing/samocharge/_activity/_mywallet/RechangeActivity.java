package com.langwing.samocharge._activity._mywallet;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseBackActivity;

public class RechangeActivity extends BaseBackActivity implements View.OnClickListener{

    @Override
    public int getLayoutID() {
        return R.layout.activity_rechange;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("充值");
        findViewById(R.id.bt_rechange_ok).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_rechange_ok:
                toActivity(RechangeFinishActivity.class);
                finish();
                break;
        }
    }
}
