package com.example.hp.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.et_username);
        final EditText etPassword = (EditText) findViewById(R.id.et_password);
        final TextView tvLogintext = (TextView) findViewById(R.id.tv_logintext);
        final TextView tvNoaccount = (TextView) findViewById(R.id.tv_noaccount);
        final TextView tvForgotpassword = (TextView) findViewById(R.id.tv_forgotpassword);
        final TextView tvRegister = (TextView) findViewById(R.id.tv_register);
        final Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("vader") && etPassword.getText().toString().equals("123")) {
                    Intent login = new Intent(Activity_Login.this, Activity_Welcome.class);
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

        tvForgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotpassIntent = new Intent(Activity_Login.this, Activity_ForgetPassword.class);
                startActivity(forgotpassIntent);
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Activity_Login.this, Activity_Register.class);
                startActivity(registerIntent);
            }
        });

    }
}