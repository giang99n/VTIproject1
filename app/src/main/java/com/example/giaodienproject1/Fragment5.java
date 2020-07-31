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

public class Fragment5 extends Fragment {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_5,container,false);
        final Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_1);
        anhxa();
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });


        return view;
    }

    public void anhxa(){
        textView1 =view.findViewById(R.id.textView9);
        textView2 =view.findViewById(R.id.textView10);
        textView3 =view.findViewById(R.id.t1);
        textView4 =view.findViewById(R.id.t2);
        textView5 =view.findViewById(R.id.t3);
        textView6 =view.findViewById(R.id.t5);
        textView7 =view.findViewById(R.id.t9);
    }
}
