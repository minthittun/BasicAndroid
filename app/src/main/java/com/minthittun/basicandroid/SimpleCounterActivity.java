package com.minthittun.basicandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleCounterActivity extends AppCompatActivity {

    private int count = 0;
    private TextView tv_counter;
    private Button btn_counter, btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_counter);

        init();

        btn_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count += 1;
                showCounter();

            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = 0;
                showCounter();

            }
        });

    }

    private void init()
    {
        getSupportActionBar().setTitle("Simple Counter");

        tv_counter = (TextView) findViewById(R.id.tv_counter);
        btn_counter = (Button) findViewById(R.id.btn_counter);
        btn_reset = (Button) findViewById(R.id.btn_reset);
    }

    private void showCounter()
    {
        tv_counter.setText(String.valueOf(count));
    }

}
