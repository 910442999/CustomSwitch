package com.ycjt.customswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Switch;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OrdinarySwitchActivity extends AppCompatActivity {

    @Bind(R.id.ordinary_switch)
    Switch mOrdinarySwitch;
    @Bind(R.id.switch_compat)
    SwitchCompat mSwitchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordinary_switch);
        ButterKnife.bind(this);

        // 添加检查改变监听器
        mOrdinarySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mOrdinarySwitch.setText("开启");
                } else {
                    mOrdinarySwitch.setText("关闭");
                }
            }
        });

         // 添加检查改变监听器
        mSwitchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSwitchCompat.setText("开启");
                } else {
                    mSwitchCompat.setText("关闭");
                }
            }
        });


    }
}
