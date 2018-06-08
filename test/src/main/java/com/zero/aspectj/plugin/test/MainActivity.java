package com.zero.aspectj.plugin.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Log
    public void toSecond(View view) {
        Toast.makeText(this, "测试插件是否成功", Toast.LENGTH_SHORT).show();
    }
}
