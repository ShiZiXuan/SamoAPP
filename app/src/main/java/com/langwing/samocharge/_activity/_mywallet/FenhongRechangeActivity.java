package com.langwing.samocharge._activity._mywallet;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseBackActivity;

public class FenhongRechangeActivity extends BaseBackActivity implements View.OnClickListener{
    private ImageView icon;
    private TextView money,tishi;

    @Override
    public int getLayoutID() {
        return R.layout.activity_fenhong_rechange;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("提现至imtoken");
        icon = findViewById(R.id.tixian_icon);
        money = findViewById(R.id.renchange_money);
        tishi = findViewById(R.id.renchange_tv);
        findViewById(R.id.rechange_but).setOnClickListener(this);
        String tixian = getIntent().getStringExtra("tixian");
        if("smv".equals(tixian)){
            icon.setImageResource(R.drawable.tixian_imtoken_smv);
            money.setText("分红余额：156000SMV");
            tishi.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rechange_but:
                showWaitDialog("");
                break;
        }
    }
}
