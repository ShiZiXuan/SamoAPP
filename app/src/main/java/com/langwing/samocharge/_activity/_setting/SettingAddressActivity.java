package com.langwing.samocharge._activity._setting;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;

import java.util.ArrayList;
import java.util.List;

public class SettingAddressActivity extends BaseBackActivity implements View.OnClickListener{
    private RecyclerView rv;
    private AddressRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    @Override
    public int getLayoutID() {
        return R.layout.activity_setting_address;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("我的收货地址");
        setRight("添加新地址");
        RelativeLayout rl = findViewById(R.id.title);
        TextView tv = rl.findViewById(R.id.tv_right);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(AddAddressActivity.class);
            }
        });
        rv = findViewById(R.id.address_rv);
        for(int i=0;i<5;++i){
            list.add(i+"号青青");
        }
        adapter = new AddressRvAdapter(this,list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayout.VERTICAL);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_right:
                toActivity(AddAddressActivity.class);
                break;
        }
    }
}
