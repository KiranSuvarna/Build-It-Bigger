package com.imkiran.jokrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_joke_receiver);

        String test = getIntent().getStringExtra("test");
        TextView jokesTextview = findViewById(R.id.jokes_textview);
        jokesTextview.setText(test);
    }
}
