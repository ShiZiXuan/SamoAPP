package com.langwing.samocharge._fragment._mine;

import android.support.annotation.Nullable;
import android.os.Bundle;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;

public class OrderDetailActivity extends BaseBackActivity {

    @Override
    public int getLayoutID() {
        return R.layout.activity_order_detail;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("订单详情");
    }
}
