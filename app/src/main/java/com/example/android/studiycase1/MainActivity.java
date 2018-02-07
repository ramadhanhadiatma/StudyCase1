package com.example.android.studiycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE = "com.example.android.studycase1.extra.MESSAGE";

    private EditText mMessageEditText;
    private EditText mPorsiEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = (EditText) findViewById(R.id.editText_makan);
        mPorsiEditText = (EditText) findViewById(R.id.editText_porsi);
    }

    public void eatbus(View view) {
        Log.d(LOG_TAG, "Button Clicked");

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", mMessageEditText.getText().toString());
        intent.putExtra("porsi", mPorsiEditText.getText().toString());
        startActivity(intent);

        Toast.makeText(getApplicationContext(), "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();

    }

    public void abnormal(View view) {
        Log.d(LOG_TAG, "Button Clicked");

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", mMessageEditText.getText().toString());
        intent.putExtra("porsi", mPorsiEditText.getText().toString());
        startActivity(intent);

        Toast.makeText(getApplicationContext(), "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
    }
}
