package com.example.android.studiycase1;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView_makan = (TextView) findViewById(R.id.textView_makan);
        TextView textView_porsi = (TextView) findViewById(R.id.textView_porsi);
        //TextView

            textView_makan.setText(getIntent().getStringExtra("message"));
            textView_porsi.setText(getIntent().getStringExtra("porsi"));

    }
}
