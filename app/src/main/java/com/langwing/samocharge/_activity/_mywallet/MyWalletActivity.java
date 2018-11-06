package com.langwing.samocharge._activity._mywallet;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._mywallet.adapter.MyPagerAdapter;
import com.langwing.samocharge._base.BaseBackActivity;

import java.util.ArrayList;
import java.util.List;

public class MyWalletActivity extends BaseBackActivity implements View.OnClickListener{
    TabLayout tab;
    ViewPager vp;
    private List<String> tabs;
    private List<Fragment> fragments;

    @Override
    public int getLayoutID() {
        return R.layout.activity_my_wallet;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("我的账户");
        tab = findViewById(R.id.wallet_tablayout);
        vp = findViewById(R.id.wallet_vp);
        findViewById(R.id.wallet_rechange_bt).setOnClickListener(this);
        findViewById(R.id.wallet_toSmv_ll).setOnClickListener(this);
        findViewById(R.id.wallet_toFenhong_ll).setOnClickListener(this);
        initTablayout();
    }

    private void initTablayout() {
        fragments = new ArrayList<>();
        tabs = new ArrayList<>();
        fragments.add(new WalletDetailFragment());
        fragments.add(new RechargeRecordFragment());
        tabs.add("消费明细");
        tabs.add("充值记录");
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),fragments,tabs));
        tab.setupWithViewPager(vp);//此方法就是让tablayout和ViewPager联动
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wallet_rechange_bt:
                toActivity(RechangeActivity.class);
                break;
            case R.id.wallet_toSmv_ll:
                toActivity(SMVActivity.class);
                break;
            case R.id.wallet_toFenhong_ll:
                toActivity(FenhongActivity.class);
                break;
        }
    }
}
