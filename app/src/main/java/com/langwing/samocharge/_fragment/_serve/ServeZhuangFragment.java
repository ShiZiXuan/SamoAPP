package com.langwing.samocharge._fragment._serve;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseFragment;
import com.langwing.samocharge._fragment._serve.adapter.ZhuangRvAdapter;

import java.util.ArrayList;
import java.util.List;

public class ServeZhuangFragment extends BaseFragment {
    private RecyclerView rv;
    private ZhuangRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.fragment_serve_zhuang;
    }

    @Override
    public void initView(View view, Bundle savedInstanceState) {
        rv = view.findViewById(R.id.rv_serve_zhuang);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(manager);
        for(int i=0;i<10;++i){
            list.add("名字"+i);
        }
        adapter = new ZhuangRvAdapter(getActivity(),list);
        rv.setAdapter(adapter);
    }
}
