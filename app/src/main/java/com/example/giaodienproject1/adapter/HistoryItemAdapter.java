package com.example.giaodienproject1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.giaodienproject1.R;
import com.example.giaodienproject1.model.HistoryItem;

import java.util.List;

public class HistoryItemAdapter extends RecyclerView.Adapter {
    List<HistoryItem> items;
    Context context;

    public HistoryItemAdapter(List<HistoryItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_history,parent,false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        HistoryViewHolder viewHolder =(HistoryViewHolder) holder;
        HistoryItem item =items.get(position);

        viewHolder.txtCoin.setText("+ "+item.getCoin()+ " Coin");
        viewHolder.txtHT.setText(item.getHinhThuc());
        viewHolder.txtDate.setText(item.getDate());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder{
        TextView txtCoin;
        TextView txtHT;
        TextView txtDate;

        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCoin = itemView.findViewById(R.id.textView23);
            txtDate = itemView.findViewById(R.id.textView22);
            txtHT = itemView.findViewById(R.id.textView21);
        }
    }
}
