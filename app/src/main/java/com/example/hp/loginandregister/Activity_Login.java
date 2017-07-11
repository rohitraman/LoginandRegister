package com.example.hp.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
        final String username,password;
        String password1="123";
        String username1="vader";
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            username1=bundle.getString("ChangeUsername");
            password1=bundle.getString("ChangePassword");
        }
        else
        {
            username1="vader";
            password1="123";
        }

        username = username1;
        password = password1;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals(username) && etPassword.getText().toString().equals(password)) {
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