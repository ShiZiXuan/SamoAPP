package com.langwing.samocharge._activity._serve;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._serve.adapter.ServeRvAdapter;
import com.langwing.samocharge._base.BaseBackActivity;

import java.util.ArrayList;
import java.util.List;

public class ServeMoneyActivity extends BaseBackActivity{
    private RecyclerView rv;
    private ServeRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    @Override
    public int getLayoutID() {
        return R.layout.activity_serve_money;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("当前资产");
        rv = findViewById(R.id.serve_money_rv);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        for(int i=0;i<10;++i){
            list.add("名字"+i);
        }
        adapter = new ServeRvAdapter(this,list);
        rv.setAdapter(adapter);
    }
}
