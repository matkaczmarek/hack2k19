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

public class DetailsLayout extends AppCompatActivity{

    Button photo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);
    }


    @Override
    protected void onStart() {
        super.onStart();
        addPhotoButtonListenerOnButton(this);
    }

    public void addPhotoButtonListenerOnButton(final Activity activity) {
        photo = (Button) findViewById(R.id.addPhoto);

        photo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(DetailsLayout.this, AddPhotoLayout.class));
            }

        });
    }
}
