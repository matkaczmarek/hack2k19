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

public class ZgloszenieLayout extends AppCompatActivity{

    Button niehuman;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donos_layout);
    }


    @Override
    protected void onStart() {
        super.onStart();
        addNiehumanButtonListenerOnButton(this);
    }

    public void addNiehumanButtonListenerOnButton(final Activity activity) {
        niehuman = (Button) findViewById(R.id.niehumanitarne);

        niehuman.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(ZgloszenieLayout.this, DetailsLayout.class));
            }

        });
    }
}
