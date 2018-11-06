package com.langwing.samocharge._activity._mywallet;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._mywallet.adapter.MyPagerAdapter;
import com.langwing.samocharge._base.BaseBackActivity;
import com.langwing.samocharge._fragment._mine.FenhongDetailFragment;
import com.langwing.samocharge._fragment._mine.FenhongGetFragment;

import java.util.ArrayList;
import java.util.List;

public class FenhongActivity extends BaseBackActivity implements View.OnClickListener{

    TabLayout tab;
    ViewPager vp;
    private List<String> tabs;
    private List<Fragment> fragments;
    @Override
    public int getLayoutID() {
        return R.layout.activity_fenhong;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("分红收益");
        tab = findViewById(R.id.fenhong_tablayout);
        vp = findViewById(R.id.fenhong_vp);
        findViewById(R.id.bt_fenhong_tixian).setOnClickListener(this);
        initTablayout();
    }
    private void initTablayout() {
        fragments = new ArrayList<>();
        tabs = new ArrayList<>();
        fragments.add(new FenhongGetFragment());
        fragments.add(new FenhongDetailFragment());
        tabs.add("SMV分红收益图");
        tabs.add("收益明细");
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),fragments,tabs));
        tab.setupWithViewPager(vp);//此方法就是让tablayout和ViewPager联动
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_fenhong_tixian:
                toActivity(FenhongRechangeActivity.class,"tixian","fenhong");
                break;
        }
    }
}
