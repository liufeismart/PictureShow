package com.liufeismart.picture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by humax on 18/8/28
 */
public class SplashActivity extends Activity {

    private Button bt_ok;
    private EditText et_num;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bt_ok = this.findViewById(R.id.bt_ok);
        et_num = this.findViewById(R.id.et_num);
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = et_num.getText().toString();
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.putExtra("content", content);
                startActivity(intent);
            }
        });
    }
}
