package com.example.giaodienproject1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.giaodienproject1.adapter.HistoryItemAdapter;
import com.example.giaodienproject1.model.HistoryItem;

import java.util.ArrayList;
import java.util.List;

public class Fragment4 extends Fragment {
    View view;
    TextView txtnap,txt1,txt3;
    HistoryItemAdapter adapter;
    List<HistoryItem> items;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_4,container,false);
        txtnap =view.findViewById(R.id.napcoin);
        txt1 = view.findViewById(R.id.bieudoGD);
        txt3 = view.findViewById(R.id.lichsuGD);
        final Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_1);
        final RecyclerView recyclerView =view.findViewById(R.id.recyclerview);
        //RecyclerView
        items = new ArrayList<>();
        items.add(new HistoryItem("20-7-2020",5,"Thanh toán tại văn phòng"));
        items.add(new HistoryItem("21-7-2020",15,"Thanh toán tại văn phòng"));
        items.add(new HistoryItem("22-7-2020",5,"Thanh toán bằng thẻ"));
        items.add(new HistoryItem("22-7-2020",5,"Thanh toán bằng thẻ"));
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager =new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        adapter = new HistoryItemAdapter(items,getActivity());
        recyclerView.setAdapter(adapter);

        //chuyển sang nap coin
        txtnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.bottomNavigationView.setSelectedItemId(R.id.nav_2);
            }
        });
        //Biểu đồ giao dịch
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);

            }
        });
        // Lịch sử GD
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });

        return view;
    }
}
