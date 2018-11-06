package com.langwing.samocharge._activity._setting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.langwing.samocharge.R;

import java.util.List;

public class AddressRvAdapter extends RecyclerView.Adapter<AddressRvAdapter.Myholder> {
    private Context mContext;
    private List<String> list;

    public AddressRvAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_rv_address,viewGroup,false);
        Myholder holder = new Myholder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder myholder, int i) {
        myholder.name.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Myholder extends RecyclerView.ViewHolder{
        private TextView name;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_address_name);
        }
    }
}
