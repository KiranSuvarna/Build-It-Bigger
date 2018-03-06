package com.imkiran.jokrv;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeReceiverActivity extends AppCompatActivity {

    public static final String JOKE= "joke";

    public static Intent launchIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeReceiverActivity.class);
        intent.putExtra(JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_joke_receiver);

        String test = getIntent().getStringExtra(JOKE);
        TextView jokesTextview = findViewById(R.id.jokes_textview);
        jokesTextview.setText(test);
    }
}
