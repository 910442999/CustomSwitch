package com.ycjt.customswitch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.ordinary_switch)
    Button mOrdinarySwitch;
    @Bind(R.id.custom_style)
    Button mCustomStyle;
    @Bind(R.id.CheckBox)
    Button mCheckBox;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.ordinary_switch, R.id.custom_style, R.id.CheckBox})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ordinary_switch:
                mIntent = new Intent(this, OrdinarySwitchActivity.class);
                startActivity(mIntent);
                break;
            case R.id.custom_style:
                mIntent = new Intent(this, CustomStyleActivity.class);
                startActivity(mIntent);
                break;
            case R.id.CheckBox:
                mIntent = new Intent(this, CheckBoxActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
