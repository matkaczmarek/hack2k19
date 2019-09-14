package com.example.mat_k.hack2k19;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by mat_k on 14.09.2019.
 */

public class InterwencjaLayout extends AppCompatActivity{

    Button animalsButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intervence_layout);
    }


    @Override
    protected void onStart() {
        super.onStart();
        addAnimalsButtonListenerOnButton(this);
    }

    public void addAnimalsButtonListenerOnButton(final Activity activity) {
        animalsButton = (Button) findViewById(R.id.animals_button);

        animalsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(InterwencjaLayout.this, ZgloszenieLayout.class));
            }

        });
    }
}
