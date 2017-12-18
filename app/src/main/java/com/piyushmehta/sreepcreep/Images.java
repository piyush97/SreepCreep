package com.piyushmehta.sreepcreep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int mFlipping = 0 ; // Initially flipping is off
        Button mButton ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper1);


        /** Start Flipping */
        flipper.startFlipping();
        mFlipping=1;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void another(MenuItem item) {
        startActivity(new Intent(Images.this, HBD.class));
    }
}

