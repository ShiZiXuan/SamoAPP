package com.langwing.samocharge._activity._setting;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;
import com.langwing.samocharge._utils.ToastUtil;

public class AddAddressActivity extends BaseBackActivity {
    private TextView right;
    @Override
    public int getLayoutID() {
        return R.layout.activity_add_address;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("添加地址");
        setRight("保存");
        RelativeLayout rl = findViewById(R.id.title);
        TextView tv = rl.findViewById(R.id.tv_right);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.toast(AddAddressActivity.this,"保存成功");
            }
        });
    }
}
