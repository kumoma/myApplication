package com.example.myapplication6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private WaveView waveView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setStatusBarLayoutStyle(this, true);//状态栏透色
        findViewById(R.id.button5).setOnClickListener(this);
        TextView test1 = findViewById(R.id.textView8);
        TextView test2 = findViewById(R.id.textView14);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "writeen.ttf");
        test1.setTypeface(typeface);
        test2.setTypeface(typeface);
        waveView3=findViewById(R.id.wave_view);
        final CircularProgressView circularProgressView=findViewById(R.id.circularProgressView);
        final FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2,-2);
        lp.gravity = Gravity.BOTTOM|Gravity.CENTER;
        waveView3.setOnWaveAnimationListener(new WaveView.OnWaveAnimationListener() {
            @Override
            public void OnWaveAnimation(float y) {
                lp.setMargins(0,0,0,(int)y+2);
               
            }
        });




    }

    public void setwrite()
    {
        TextView testitem=findViewById(R.id.textView6);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"writeen.ttf");
        testitem.setTypeface(typeface);
    }





    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.button5:
                AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("确认" ) ;
                builder.setMessage("这是一个简单消息框" ) ;
                builder.setPositiveButton("是" ,  null );
                builder.show();

                Intent intent=new Intent(MainActivity.this,historyActivity.class);
                startActivity(intent);

                break;
        }

    }
}
