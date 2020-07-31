package com.example.giaodienproject1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    EditText editText;
    Button btn50,btn100,btn150,btn200 , btnxacnhan;
    RadioButton radioButton1,radioButton2;
    TextView back;
    int s;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_2,container,false);
        final Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_1);
        editText = view. findViewById(R.id.editTextTextPersonName);
        btn50 = view. findViewById(R.id.button50);
        btn100 = view. findViewById(R.id.button100);
        btn150 = view. findViewById(R.id.button150);
        back = view.findViewById(R.id.textView4);
        btn200 = view.findViewById(R.id.button200);
        btnxacnhan = view.findViewById(R.id.button5);
        radioButton1 = view.findViewById(R.id.radioButton1);
        radioButton2 = view.findViewById(R.id.radioButton2);

        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                if(editText.getText().toString()=="") editText.setText("0");
                s = Integer.parseInt(editText.getText().toString())  +50;
                editText.setText( String.valueOf(s));
            }
        });
        btn100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                s = Integer.parseInt(editText.getText().toString())+100;
                editText.setText( String.valueOf(s));
            }
        });
        btn150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                s = Integer.parseInt(editText.getText().toString())+150;
                editText.setText( String.valueOf(s));
            }
        });
        btn200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                s = Integer.parseInt(editText.getText().toString())+200;
                editText.setText( String.valueOf(s));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // view.startAnimation(animation);
                MainActivity.bottomNavigationView.setSelectedItemId(R.id.nav_1);
            }
        });
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
                if(radioButton1.isChecked())
                    Toast.makeText(getActivity(),radioButton1.getText()+": "+ editText.getText(),Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(),radioButton2.getText()+": "+ editText.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
