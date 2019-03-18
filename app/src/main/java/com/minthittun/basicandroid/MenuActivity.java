package com.minthittun.basicandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btn_test_1, btn_test_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        init();

        btn_test_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainActivityIntent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);

            }
        });

        btn_test_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent simpleCounterActivityIntent = new Intent(MenuActivity.this, SimpleCounterActivity.class);
                startActivity(simpleCounterActivityIntent);

            }
        });

    }

    private void init(){
        getSupportActionBar().setTitle("Main Menu");

        btn_test_1 = (Button) findViewById(R.id.btn_test_1);
        btn_test_2 = (Button) findViewById(R.id.btn_test_2);
    }

}
