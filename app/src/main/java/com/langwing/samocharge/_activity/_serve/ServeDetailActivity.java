package com.langwing.samocharge._activity._serve;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._mywallet.RechargeRecordFragment;
import com.langwing.samocharge._activity._mywallet.WalletDetailFragment;
import com.langwing.samocharge._activity._mywallet.adapter.MyPagerAdapter;
import com.langwing.samocharge._activity._setting.AddAddressActivity;
import com.langwing.samocharge._base.BaseBackActivity;
import com.langwing.samocharge._fragment._serve.ServeTimeFragment;
import com.langwing.samocharge._fragment._serve.ServeZhuangFragment;

import java.util.ArrayList;
import java.util.List;

public class ServeDetailActivity extends BaseBackActivity implements View.OnClickListener{
    TabLayout tab;
    ViewPager vp;
    private List<String> tabs;
    private List<Fragment> fragments;
    private Button but;
    @Override
    public int getLayoutID() {
        return R.layout.activity_serve_detail;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("综合收益权收益");
        setRight("申请解约");
        RelativeLayout rl = findViewById(R.id.title);
        TextView tv = rl.findViewById(R.id.tv_right);
        but = findViewById(R.id.serve_cancel_bt);
        but.setOnClickListener(this);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but.setVisibility(View.VISIBLE);
            }
        });
        tab = findViewById(R.id.serve_tablayout);
        vp = findViewById(R.id.serve_vp);
        initTablayout();
    }
    private void initTablayout() {
        fragments = new ArrayList<>();
        tabs = new ArrayList<>();
        fragments.add(new ServeZhuangFragment());
        fragments.add(new ServeTimeFragment());
        tabs.add("按桩查看");
        tabs.add("按时间查看");
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),fragments,tabs));
        tab.setupWithViewPager(vp);//此方法就是让tablayout和ViewPager联动
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.serve_cancel_bt:
                showPop();
                break;
        }
    }

    private void showPop() {

    }
    public class TestPopupWindow extends PopupWindow {
        public TestPopupWindow(Context context) {
            super(context);
            setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
            setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
            setOutsideTouchable(true);
            setFocusable(true);
            setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            View contentView = LayoutInflater.from(context).inflate(R.layout.pop_serve_detail,
                    null, false);
            setContentView(contentView);
        }
    }
}
