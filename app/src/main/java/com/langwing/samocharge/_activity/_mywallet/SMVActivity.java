package com.langwing.samocharge._activity._mywallet;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._mywallet.adapter.WalletRvAdapter;
import com.langwing.samocharge._base.BaseBackActivity;

import java.util.ArrayList;
import java.util.List;

public class SMVActivity extends BaseBackActivity implements View.OnClickListener{
    private TextView longtv;
    private WalletRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    private RecyclerView rv;

    @Override
    public int getLayoutID() {
        return R.layout.activity_smv;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("SMV");
       longtv =  findViewById(R.id.smv_tv_long);
       rv = findViewById(R.id.smv_record_rv);
       findViewById(R.id.smv_rechange).setOnClickListener(this);
        Spanned spanned = Html.fromHtml("不可用SMV： 通过商城认购充电桩综合收益所赠送的SMV，在未到认购期限时，:<font color='#FF0000'>该部分锁定。</font>");
        longtv.setText(spanned);
        for(int i=0;i<10;++i){
            list.add("SMV名字"+i);
        }
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        adapter = new WalletRvAdapter(this,list);
        rv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.smv_rechange:
                toActivity(FenhongRechangeActivity.class,"tixian","smv");
                break;
        }
    }
}
