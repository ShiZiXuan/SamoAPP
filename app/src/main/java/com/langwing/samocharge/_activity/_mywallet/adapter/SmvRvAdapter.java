package com.langwing.samocharge._activity._mywallet.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.langwing.samocharge._base.BaseRecyclerViewAdapter;

import java.util.List;

public class SmvRvAdapter extends BaseRecyclerViewAdapter<SmvRvAdapter.MyHolder> {
    private Context mContext;
    private List<String> list;

    public SmvRvAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public void bindDate(MyHolder holder, int position) {

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
