package com.zhjh.guideviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.zhjh.guideview.GuideView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_top_left;
    private Button bt_top_right;
    private Button bt_middle;
    private Button bt_bottom_left;
    private Button bt_bottom_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews() {
        bt_top_left = (Button) findViewById(R.id.bt_top_left);
        bt_top_left.setOnClickListener(this);
        bt_top_right = (Button) findViewById(R.id.bt_top_right);
        bt_top_right.setOnClickListener(this);
        bt_middle = (Button) findViewById(R.id.bt_middle);
        bt_middle.setOnClickListener(this);
        bt_bottom_left = (Button) findViewById(R.id.bt_bottom_left);
        bt_bottom_left.setOnClickListener(this);
        bt_bottom_right = (Button) findViewById(R.id.bt_bottom_right);
        bt_bottom_right.setOnClickListener(this);
        GuideView.builder(this)
                .addNoHighLightGuidView(R.drawable.listlead)
                .setMaskColor(getResources().getColor(R.color.mask_color))
                .show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_top_left:
                GuideView.builder(this)
                        .addHighLightGuidView(bt_top_left, R.drawable.dmtext)
                        .setHighLightStyle(GuideView.VIEWSTYLE_OVAL)
                        .show();
                break;
            case R.id.bt_top_right:
                GuideView.builder(this)
                        .addHighLightGuidView(bt_top_right, R.drawable.dstext)
                        .setHighLightStyle(GuideView.VIEWSTYLE_RECT)
                        .show();
                break;
            case R.id.bt_middle:
                GuideView.builder(this)
                        .addHighLightGuidView(bt_middle, R.drawable.dmtext)
                        .setHighLightStyle(GuideView.VIEWSTYLE_CIRCLE)
                        .show();
                break;
            case R.id.bt_bottom_left:
                GuideView.builder(this)
                        .addHighLightGuidView(bt_bottom_left, R.drawable.dstext)
                        .addHighLightGuidView(bt_top_right, R.drawable.dmtext)
                        .setHighLightStyle(GuideView.VIEWSTYLE_RECT)
                        .show();
                break;
            case R.id.bt_bottom_right:
                GuideView.builder(this)
                        .addHighLightGuidView(bt_bottom_right, R.drawable.dstext)
                        .addHighLightGuidView(bt_top_left, R.drawable.dmtext)
                        .setHighLightStyle(GuideView.VIEWSTYLE_OVAL)
                        .show();
                break;
        }
    }
}
