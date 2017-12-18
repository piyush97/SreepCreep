package com.piyushmehta.sreepcreep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */

public class MainActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = (EditText) findViewById(R.id.username);
        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);
    }

    public void SignIn(View view) {

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if (username.equalsIgnoreCase("Pree") && password.equalsIgnoreCase("MaiPatliHun")){
            Toast.makeText(this, "Chalo", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity.this, FullscreenActivity.class));

        }
        else{
            Toast.makeText(this, "Sahi PassWord Daal Bey!", Toast.LENGTH_SHORT).show();
        }
    }



}

