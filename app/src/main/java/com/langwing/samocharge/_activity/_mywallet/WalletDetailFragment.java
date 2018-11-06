package com.langwing.samocharge._activity._mywallet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codbking.widget.DatePickDialog;
import com.codbking.widget.OnChangeLisener;
import com.codbking.widget.OnSureLisener;
import com.codbking.widget.bean.DateType;
import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._mywallet.adapter.WalletRvAdapter;
import com.langwing.samocharge._base.BaseFragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 消费明细
 */
public class WalletDetailFragment extends BaseFragment implements View.OnClickListener{
    private RecyclerView rv;
    private WalletRvAdapter adapter;
    private List<String> list = new ArrayList<>();
    private TextView time;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_wallet_detail;
    }

    @Override
    public void initView(View view, Bundle savedInstanceState) {
        rv = view.findViewById(R.id.wallet_detail_rv);
        time = view.findViewById(R.id.tv_wallet_detail_time);
        view.findViewById(R.id.wallet_detail_time_iv).setOnClickListener(this);
        for(int i=0;i<10;++i){
            list.add("名字"+i+"号");
        }
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(manager);
        adapter = new WalletRvAdapter(getActivity(),list);
        rv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wallet_detail_time_iv:
                initTimePicker();
                break;
        }
    }

    private void initTimePicker() {
        DatePickDialog dialog = new DatePickDialog(getActivity());
        //设置上下年分限制
        dialog.setYearLimt(5);
        //设置标题
        dialog.setTitle("选择时间");
        //设置类型
        dialog.setType(DateType.TYPE_YMD);
        //设置消息体的显示格式，日期格式
        dialog.setMessageFormat("yyyy-MM");
        //设置选择回调
        dialog.setOnChangeLisener(null);
        //设置点击确定按钮回调
        dialog.setOnSureLisener(new OnSureLisener() {
            @Override
            public void onSure(Date date) {
                time.setText(DateToStr(date));
            }
        });
        dialog.show();

    }
     public static String DateToStr(Date date) {

           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            String str = format.format(date);
            return str;
         }

}
