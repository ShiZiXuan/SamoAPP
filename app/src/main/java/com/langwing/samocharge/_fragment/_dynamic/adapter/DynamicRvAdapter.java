package com.langwing.samocharge._fragment._dynamic.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.langwing.samocharge.R;

import java.util.List;

public class DynamicRvAdapter extends RecyclerView.Adapter<DynamicRvAdapter.TwoViewHolder> {

    private Context mContext;
    private List<String> list;

    public DynamicRvAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public DynamicRvAdapter.TwoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        TwoViewHolder holder = null;
        View view = inflater.inflate(R.layout.item_rv_dynamic2, viewGroup, false);
        holder = new TwoViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TwoViewHolder twoViewHolder, int i) {
        twoViewHolder.name.setText(list.get(i));
    }



    @Override
    public int getItemCount() {
        return list.size();
    }


    class TwoViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        public TwoViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.dynamic2_item_name);
        }
    }
}
