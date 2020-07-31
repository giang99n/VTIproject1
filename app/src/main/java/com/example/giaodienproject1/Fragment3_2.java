package com.example.giaodienproject1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.FileInputStream;

public class Fragment3_2 extends Fragment {
    ImageView imageView;
    Bitmap bmp=null;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_3_2,container,false);
        imageView=view.findViewById(R.id.imageView);
        Bundle bundle =getArguments();
        if(bundle!=null){
            String filename  = bundle.getString("dulieu");
            try {
                FileInputStream is = getActivity().openFileInput(filename);
                bmp = BitmapFactory.decodeStream(is);
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            imageView.setImageBitmap(bmp);
        }


        return view;
    }


}
