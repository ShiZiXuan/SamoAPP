package com.langwing.samocharge._fragment._mine;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._login.LoginActivity;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;
import com.langwing.samocharge._base.BaseRecyclerViewAdapter;
import com.langwing.samocharge._fragment._mine.adapter.MyOrderRvAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyOrderActivity extends BaseBackActivity implements BaseRecyclerViewAdapter.ItemClickListener {
    private RecyclerView rv;
    private MyOrderRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    @Override
    public int getLayoutID() {
        return R.layout.activity_my_order;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("我的订单");
        rv = findViewById(R.id.rv_my_order);
        for(int i=0;i<10;++i){
            list.add("名字"+i+"号");
        }
        adapter = new MyOrderRvAdapter(this,list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
    }


    @Override
    public void onItemClickListener(View view, int position) {
        toActivity(OrderDetailActivity.class);

    }
}
