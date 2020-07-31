package com.example.giaodienproject1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    public  static BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment1()).commit();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        bottomNavigationView =findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }
    public  BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment nav_fragment =null;
                    switch (item.getItemId()){
                        case R.id.nav_1:
                            nav_fragment =new Fragment1();
                            break;
                        case R.id.nav_2:
                            nav_fragment =new Fragment2();
                            break;
                        case R.id.nav_3:
                            nav_fragment =new Fragment3();
                            break;
                        case R.id.nav_4:
                            nav_fragment =new Fragment4();
                            break;
                        case R.id.nav_5:
                            nav_fragment =new Fragment5();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,nav_fragment).commit();

                    return  true;
                }

            };


}