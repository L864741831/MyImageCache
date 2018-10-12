package com.edu.imagecache.myimagecache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MyBitmapUtils util;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)this.findViewById(R.id.img);

        util = new MyBitmapUtils();

    }


    public void show(View v){
        util.disPlay(img,"http://diy.qqjay.com/u/files/2012/0209/2f45e7e0d06a69a974949c0872a5ec5a.jpg");
    }


}
