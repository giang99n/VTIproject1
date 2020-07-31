package com.example.giaodienproject1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ActivityMuaHang extends AppCompatActivity {

    int request_code =111;
    Bitmap bmp=null;
    byte[] byteArray=null;
    Fragment fragment =null;
    Bundle bundle=new Bundle();
    String filename = "bitmap.png";
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_mua_hang);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutScan,new Fragment3_1()).commit();
        txt1=findViewById(R.id.add1);
        txt2=findViewById(R.id.add2);
    }

    public void AddFragment(View view){
        Fragment fragment =null;

        switch (view.getId()){
            case R.id.add1:
                fragment =new Fragment3_1();
              //  getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutScan,fragment).commit();
                txt1.setBackgroundColor(Color.parseColor("#2E47DA"));
                txt1.setTextColor(Color.parseColor("#FFFFFF"));
                txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                txt2.setTextColor(Color.parseColor("#2E47DA"));
                break;
            case R.id.add2:
                Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,request_code);
                txt2.setBackgroundColor(Color.parseColor("#2E47DA"));
                txt2.setTextColor(Color.parseColor("#FFFFFF"));
                txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                txt1.setTextColor(Color.parseColor("#2E47DA"));
                fragment =new Fragment3_2();
                Bundle bundle=new Bundle();
                bundle.putString("dulieu",filename);
                fragment.setArguments(bundle);
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutScan,fragment).commit();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==request_code && resultCode ==RESULT_OK && data!=null ){
            bmp =(Bitmap) data.getExtras().get("data");
            try {
                FileOutputStream stream = this.openFileOutput(filename, Context.MODE_PRIVATE);
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                stream.close();
                bmp.recycle();
            } catch (Exception e) {
                e.printStackTrace();
            }
//            ByteArrayOutputStream stream = new ByteArrayOutputStream();
//            bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
//            byteArray = stream.toByteArray();
//            bmp.recycle();

//            fragment =new Fragment4_2();
//            bundle.putByteArray("dulieu",byteArray);//////
//            fragment.setArguments(bundle);///////////
//            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutScan,fragment).commit();

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}