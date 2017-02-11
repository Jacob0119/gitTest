package com.example.amco1.cadi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnIntro.setOnClickListener(this);
/*
        btnIntro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast.makeText(MainActivity.this,"버튼 눌렸음",Toast.LENGTH_LONG).show();


            }


        });

  */
    }

    public  void initView()
    {

        btnIntro=(Button)findViewById(R.id.btnintro1);

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.btnintro1:
                Toast.makeText(this,"눌렀습니다.",Toast.LENGTH_LONG).show();
                break;

        }
    }

    @Override
    protected void onRestart() {



        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
