package com.liufeismart.picture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_bg;

    private String url = "http://assets.humaxer.com/download/bg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_bg = this.findViewById(R.id.iv_bg);

    }

    @Override
    protected void onResume() {
        super.onResume();
        url += getIntent().getStringExtra("content")+".jpeg";
        Log.v("URL", url);
        Log.v("MainActivity", "onResume");
        Glide.with(this).load(url).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(iv_bg);
//        iv_bg.setImageResource(R.drawable.bg);
    }
}
