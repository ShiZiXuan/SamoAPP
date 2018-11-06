package com.langwing.samocharge._fragment._mine.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseRecyclerViewAdapter;

import java.util.List;

public class MyOrderRvAdapter extends BaseRecyclerViewAdapter<MyOrderRvAdapter.MyHolder> {
    private Context mContext;
    private List<String> list;

    public MyOrderRvAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_my_order,viewGroup,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }


    @Override
    public void bindDate(MyHolder holder, int position) {
        holder.name.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        TextView name;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_order_name);
        }
    }
}
