package com.example.hp.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        final TextView logintext = (TextView) findViewById(R.id.logintext);
        final TextView noaccount = (TextView) findViewById(R.id.noaccount);
        final TextView forgotpass = (TextView) findViewById(R.id.forgotpassword);
        final TextView register = (TextView) findViewById(R.id.register);
        final Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("vader") && password.getText().toString().equals("123")) {
                    Intent login = new Intent(MainActivity.this, Login.class);
                    startActivity(login);
                    Toast.makeText(getApplicationContext(),"Hello Admin",Toast.LENGTH_LONG).show();
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();
                }
            }

        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotpassIntent = new Intent(MainActivity.this, Forgetpassword.class);
                startActivity(forgotpassIntent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, Register.class);
                startActivity(registerIntent);
            }
        });

    }
}