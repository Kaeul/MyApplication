package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "1번 버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

        Button btn = (Button)findViewById(R.id.button2);
            btn.setOnTouchListener(
                    new Button.OnTouchListener(){
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            return false;
                        }

                        int ct=0;
                        public void onClick(View v){
                            ct++;
                            Log.v("클릭하세요!", ct+"")
                        }
                    }
            );
    }
}
