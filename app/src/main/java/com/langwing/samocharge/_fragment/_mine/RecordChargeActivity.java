package com.langwing.samocharge._fragment._mine;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseBackActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 充电记录
 */
public class RecordChargeActivity extends BaseBackActivity implements View.OnClickListener{
    private TextView tv1,tv2,tv3;
    @Override
    public int getLayoutID() {
        return R.layout.activity_record_charge;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("充电记录");
        tv1 = findViewById(R.id.record_tv1);
        tv2 = findViewById(R.id.record_tv2);
        tv3 = findViewById(R.id.record_tv3);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.record_tv1:
                tv1.setBackgroundResource(R.drawable.shape_white_stroke2);
                tv2.setBackgroundResource(R.drawable.shape_white_stroke);
                tv3.setBackgroundResource(R.drawable.shape_white_stroke1);
                tv2.setTextColor(getResources().getColor(R.color.white_ff));
                tv1.setTextColor(getResources().getColor(R.color.colorPrimary));
                tv3.setTextColor(getResources().getColor(R.color.white_ff));
                break;
            case R.id.record_tv2:
                tv2.setBackgroundResource(R.drawable.shape_white_stroke3);
                tv1.setBackgroundResource(R.drawable.shape_white_stroke1);
                tv3.setBackgroundResource(R.drawable.shape_white_stroke1);
                tv1.setTextColor(getResources().getColor(R.color.white_ff));
                tv2.setTextColor(getResources().getColor(R.color.colorPrimary));
                tv3.setTextColor(getResources().getColor(R.color.white_ff));
                break;
            case R.id.record_tv3:
                tv3.setBackgroundResource(R.drawable.shape_white_stroke2);
                tv1.setBackgroundResource(R.drawable.shape_white_stroke1);
                tv2.setBackgroundResource(R.drawable.shape_white_stroke);
                tv1.setTextColor(getResources().getColor(R.color.white_ff));
                tv3.setTextColor(getResources().getColor(R.color.colorPrimary));
                tv2.setTextColor(getResources().getColor(R.color.white_ff));
                break;
        }
    }
}
