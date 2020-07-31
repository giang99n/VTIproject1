package com.example.giaodienproject1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.CompositePageTransformer;

import com.example.giaodienproject1.adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.tabs.TabLayout;

public class Fragment1 extends Fragment {
    MainActivity mainActivity;
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    private int dotscount;

    private ImageView[] dots;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,container,false);
        final Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_1);
        sliderDotspanel =view.findViewById(R.id.SliderDots);
        txt1 = view.findViewById(R.id.muahang);
        txt2 = view.findViewById(R.id.napcoin);
        txt3 = view.findViewById(R.id.giaodich);
        txt4 =view.findViewById(R.id.thongbao);
        txt5 =view.findViewById(R.id.zzz);
        txt6 =view.findViewById(R.id.zz);
        txt7 =view.findViewById(R.id.z);


        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                MainActivity.bottomNavigationView.setSelectedItemId(R.id.nav_1);
              //  getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment3()).commit();

            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                MainActivity.bottomNavigationView.setSelectedItemId(R.id.nav_2);
            //    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment2()).commit();

            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                MainActivity.bottomNavigationView.setSelectedItemId(R.id.nav_4);
//              getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment4()).commit();

            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });


        //viewPager
        viewPager = view.findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPadding(130,0,130,0);
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        for(int i = 0; i < dotscount; i++){
            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.tab_indicator));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(10, 0, 10, 0);
            sliderDotspanel.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.tab_indicator1));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.tab_indicator));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.tab_indicator1));
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        return view;
    }
}
