package com.luck.publictitlebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    private PublicTitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleBar = (PublicTitleBar) findViewById(R.id.titleBar);
        titleBar.setOnTitleBarClickListener(new PublicTitleBar.OnTitleBarClick() {
            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this, "左边按钮", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onRightClick() {
                Toast.makeText(MainActivity.this, "右边按钮", Toast.LENGTH_LONG).show();
            }
        });
    }
}
