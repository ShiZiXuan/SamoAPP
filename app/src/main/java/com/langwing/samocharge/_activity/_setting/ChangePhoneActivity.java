package com.langwing.samocharge._activity._setting;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;

public class ChangePhoneActivity extends BaseBackActivity implements View.OnClickListener{
    private EditText phone_et;
    private Button but;
    private ImageView clear;
    @Override
    public int getLayoutID() {
        return R.layout.activity_change_phone;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("更换手机号");
        phone_et = findViewById(R.id.et_change_phone);
        but = findViewById(R.id.but_safe_phone);
        clear = findViewById(R.id.iv_change_phone);

        clear.setOnClickListener(this);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_change_phone:
                phone_et.setText("");
                break;
            case R.id.but_safe_phone:
                but.setText("加载中...");
                break;
            case R.id.et_change_phone:
                initEdit();
                break;
        }
    }

    private void initEdit() {
        phone_et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(phone_et.getText().length()>0){
                    clear.setVisibility(View.VISIBLE);
                    if(phone_et.getText().length()==11){
                        but.setBackgroundResource(R.drawable.shape_primary_but);
                    }
                }
            }
        });
    }
}


