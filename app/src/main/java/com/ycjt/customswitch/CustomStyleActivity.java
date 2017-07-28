package com.ycjt.customswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CustomStyleActivity extends AppCompatActivity {

    @Bind(R.id.CustomSwitchCompat)
    SwitchCompat mCustomSwitchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_style);
        ButterKnife.bind(this);
        //设置自定义的thumb和track
        mCustomSwitchCompat.setThumbResource(R.drawable.thumb); //开关的图片

        mCustomSwitchCompat.setTrackResource(R.drawable.track);//开关的背景
        //设置Switch事件监听
        mCustomSwitchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mCustomSwitchCompat.setText("开启");
                } else {
                    mCustomSwitchCompat.setText("关闭");
                }
            }
        });
    }
}
