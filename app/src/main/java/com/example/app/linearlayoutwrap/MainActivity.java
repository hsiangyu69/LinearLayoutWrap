package com.example.app.linearlayoutwrap;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private WrapLayout wrapLayout;
    private LayoutInflater inflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wrapLayout = (WrapLayout) findViewById(R.id.hot_seatch_layout);
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        String[] strs = {"奔跑吧兄弟", "running man", "笑傲江湖", "快樂大本營", "侶行", "暴走大事件", "愛情保衛戰"
                , "歡樂喜劇人", "中國好聲音", "羅輯思維", "維多利亞的秘密", "非誠勿擾", "康熙來了"};
        for (int i = 0; i < strs.length; i++) {
            LinearLayout itemLayout = (LinearLayout) inflater.inflate(R.layout.layout_item, wrapLayout, false);
            TextView name = (TextView) itemLayout.findViewById(R.id.name);
            name.setText(strs[i]);
            wrapLayout.addView(itemLayout);
        }


    }
}
