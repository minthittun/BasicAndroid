package com.minthittun.basicandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_message;
    private Button btn_show_message;
    private TextView tv_show_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn_show_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this, edt_message.getText().toString(), Toast.LENGTH_SHORT).show();
                tv_show_result.setText(edt_message.getText().toString());
            }
        });

    }

    private void init()
    {
        getSupportActionBar().setTitle("Test 1");

        edt_message = (EditText) findViewById(R.id.edt_message);
        tv_show_result = (TextView) findViewById(R.id.tv_show_result);
        btn_show_message = (Button) findViewById(R.id.btn_show_message);
    }

}
