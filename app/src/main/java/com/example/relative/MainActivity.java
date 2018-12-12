package com.example.relative;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int MP = ViewGroup.LayoutParams.MATCH_PARENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.GREEN);
        setContentView(relativeLayout);


        //画面中央
        RelativeLayout.LayoutParams center_params = new RelativeLayout.LayoutParams(WC, WC);
        //(親レイアウトの真ん中)
        center_params.addRule(RelativeLayout.CENTER_IN_PARENT);
        TextView center_text = new TextView(this);
        center_text.setText("真ん中ぁ");
        center_text.setBackgroundColor(Color.RED);
        center_text.setId(View.generateViewId());
        relativeLayout.addView(center_text, center_params);

        //画面左上
        RelativeLayout.LayoutParams left_top_params = new RelativeLayout.LayoutParams(WC,WC);
        //親レイアウトの左端と子の左端を合わせる
        left_top_params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        TextView left_top_text = new TextView(this);
        left_top_text.setText("左上ぇ");
        left_top_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(left_top_text,left_top_params);

        //上部中央
        RelativeLayout.LayoutParams top_center_params = new RelativeLayout.LayoutParams(WC,WC);
        top_center_params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        top_center_params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        TextView top_center_text = new TextView(this);
        top_center_text.setText("上中ぁ");
        top_center_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(top_center_text,top_center_params);


        //画面右上
        RelativeLayout.LayoutParams right_top_params = new RelativeLayout.LayoutParams(WC,WC);
        //親レイアウトの右端と子の右端を合わせる
        right_top_params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        TextView right_top_text = new TextView(this);
        right_top_text.setText("右上ぇ");
        right_top_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(right_top_text,right_top_params);


        //右部中央
        RelativeLayout.LayoutParams right_center_params = new RelativeLayout.LayoutParams(WC,WC);
        right_center_params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        right_center_params.addRule(RelativeLayout.CENTER_VERTICAL);
        TextView right_center_text = new TextView(this);
        right_center_text.setText("右中ぁ");
        right_center_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(right_center_text,right_center_params);



        //画面左下
        RelativeLayout.LayoutParams left_bottom_params = new RelativeLayout.LayoutParams(WC,WC);
        left_bottom_params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        //親レイアウトの下端と子の下端を合わせる
        left_bottom_params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        TextView left_bottom_text = new TextView(this);
        left_bottom_text.setText("左下ぁ");
        left_bottom_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(left_bottom_text,left_bottom_params);


        //左部中央
        RelativeLayout.LayoutParams left_center_params = new RelativeLayout.LayoutParams(WC,WC);
        left_center_params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        left_center_params.addRule(RelativeLayout.CENTER_VERTICAL);
        TextView left_center_text = new TextView(this);
        left_center_text.setText("左中ぁ");
        left_center_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(left_center_text,left_center_params);


        //下部中央
        RelativeLayout.LayoutParams bottom_center_params = new RelativeLayout.LayoutParams(WC,WC);
        bottom_center_params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        bottom_center_params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        TextView bottom_center_text = new TextView(this);
        bottom_center_text.setText("下中ぁ");
        bottom_center_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(bottom_center_text,bottom_center_params);


        //画面右下
        RelativeLayout.LayoutParams right_bottom_params = new RelativeLayout.LayoutParams(WC,WC);
        right_bottom_params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        right_bottom_params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        TextView right_bottom_text = new TextView(this);
        right_bottom_text.setText("右下ぁ");
        right_bottom_text.setBackgroundColor(Color.RED);
        relativeLayout.addView(right_bottom_text,right_bottom_params);


        //center_textの下
        TextView below_text = new TextView(this);
        below_text.setText("ちょい下");
        below_text.setBackgroundColor(Color.YELLOW);
        RelativeLayout.LayoutParams below_params = new RelativeLayout.LayoutParams(WC, WC);
        //別の子の上端との子供の下端を揃える
        below_params.addRule(RelativeLayout.BELOW, center_text.getId());
        //別の子の始まりと子の始まりを揃える
        below_params.addRule(RelativeLayout.ALIGN_START, center_text.getId());
        relativeLayout.addView(below_text, below_params);

        //center_textの上
        TextView top_text = new TextView(this);
        top_text.setText("ちょい上");
        top_text.setBackgroundColor(Color.YELLOW);
        RelativeLayout.LayoutParams top_params = new RelativeLayout.LayoutParams(WC,WC);
        //別の子の下端との子供の上端を揃える
        top_params.addRule(RelativeLayout.ABOVE,center_text.getId());
        top_params.addRule(RelativeLayout.ALIGN_START,center_text.getId());
        relativeLayout.addView(top_text, top_params);

        //center_textの右
        TextView right_text = new TextView(this);
        right_text.setText("ちょい右");
        right_text.setBackgroundColor(Color.WHITE);
        RelativeLayout.LayoutParams right_params = new RelativeLayout.LayoutParams(WC,WC);
        //対象の子と同じラインに配置
        right_params.addRule(RelativeLayout.ALIGN_BASELINE,center_text.getId());
        //対象の子の右端と子の左端を揃える
        right_params.addRule(RelativeLayout.RIGHT_OF,center_text.getId());
        relativeLayout.addView(right_text, right_params);

        //center_textの左
        TextView left_text = new TextView(this);
        left_text.setText("ちょい左");
        left_text.setBackgroundColor(Color.WHITE);
        RelativeLayout.LayoutParams left_params = new RelativeLayout.LayoutParams(WC,WC);
        left_params.addRule(RelativeLayout.ALIGN_BASELINE,center_text.getId());
        //対象の子の左端と子の右端を揃える
        left_params.addRule(RelativeLayout.LEFT_OF,center_text.getId());
        relativeLayout.addView(left_text,left_params);


    }
}
