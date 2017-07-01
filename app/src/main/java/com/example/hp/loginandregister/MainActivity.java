package com.example.hp.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.hp.loginandregister.R.id.textView4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         final EditText et1 = (EditText) findViewById(R.id.username);
         final EditText et2 = (EditText) findViewById(R.id.password);
        final TextView txt4 = (TextView) findViewById(textView4);
        final TextView txt3 = (TextView) findViewById(R.id.textView6);

        final TextView txt1 = (TextView) findViewById(R.id.forgotpassword);
        final TextView txt2 = (TextView) findViewById(R.id.register);
        final Button btn = (Button) findViewById(R.id.login);



            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (et1.getText().toString().equals("vader") && et2.getText().toString().equals("123")) {
                        Intent login = new Intent(MainActivity.this, login.class);
                        startActivity(login);
                        finish();
                    }
                    else {

                                Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();

                            }



                }

            });




        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerInt = new Intent(MainActivity.this, forgetpassword.class);
                startActivity(registerInt);
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, Register.class);
                startActivity(registerIntent);
            }
        });

    }    }

