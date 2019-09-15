package com.example.mat_k.hack2k19;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SmieciLayout extends AppCompatActivity {

    Button wysypiska, posesja, spalanie, pojemniki, niebezpieczne, postepowanie;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trash_layout);
    }

    protected void onStart() {
        super.onStart();
        addButtonToGoDetails(this);
    }

    public void addButtonToGoDetails(final Activity activity) {
        wysypiska = findViewById(R.id.buttonWysypiska);
        wysypiska.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(SmieciLayout.this, DetailsLayout.class));
            }
        });

        posesja = findViewById(R.id.buttonPosesja);
        posesja.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(SmieciLayout.this, DetailsLayout.class));
            }
        });

        spalanie = findViewById(R.id.buttonSpalanie);
        spalanie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(SmieciLayout.this, DetailsLayout.class));
            }
        });

        pojemniki = findViewById(R.id.buttonPojemniki);
        pojemniki.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(SmieciLayout.this, DetailsLayout.class));
            }
        });

        niebezpieczne = findViewById(R.id.buttonNiebepieczne);
        niebezpieczne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(SmieciLayout.this, DetailsLayout.class));
            }
        });

        postepowanie = findViewById(R.id.button);
        postepowanie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(SmieciLayout.this, DetailsLayout.class));
            }
        });
    }


}
