package com.example.mat_k.hack2k19;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button intervenceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        addIntervenceButtonListenerOnButton(this);
    }

    public void addIntervenceButtonListenerOnButton(final Activity activity) {
        intervenceButton = (Button) findViewById(R.id.intervence_button);

        intervenceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(MainActivity.this, InterwencjaLayout.class));
            }

        });
    }
}

