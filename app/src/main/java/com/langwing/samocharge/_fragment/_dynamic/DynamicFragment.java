package com.langwing.samocharge._fragment._dynamic;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioGroup;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._editIdea.EditIdeaActivity;
import com.langwing.samocharge._base.BaseFragment;
import com.langwing.samocharge._fragment._dynamic._companyDynamic.CompanyDynamicFragment;
import com.langwing.samocharge._fragment._dynamic._wonderfulLife.WonderfulLifeFragment;
import com.langwing.samocharge._fragment._dynamic.adapter.DynamicRvAdapter;
import com.langwing.samocharge._utils.DD;

import java.util.ArrayList;
import java.util.List;


public class DynamicFragment extends BaseFragment{
    private RecyclerView rv;
    private DynamicRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.fragment_dynamic;
    }
    @Override
    public void initView(View view, Bundle savedInstanceState) {
        rv = view.findViewById(R.id.dynamic_rv);
        for(int i=0;i<10;++i){
            list.add("很长的名字"+i);
        }

        adapter = new DynamicRvAdapter(getActivity(),list);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
//        rv.setLayoutManager(new LinearLayoutManager(getActivity()){
//            @Override
//            public boolean canScrollVertically() {
//                //解决ScrollView里存在多个RecyclerView时滑动卡顿的问题
//                //如果你的RecyclerView是水平滑动的话可以重写canScrollHorizontally方法
//                return false;
//            }
//        });
//解决数据加载不完的问题
        rv.setNestedScrollingEnabled(false);
        rv.setHasFixedSize(true);
//解决数据加载完成后, 没有停留在顶部的问题
        rv.setFocusable(false);

    }


}
