package com.example.hp.loginandregister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final TextView tvSignup=(TextView)findViewById(R.id.tv_signup);
        final EditText etName=(EditText)findViewById(R.id.et_name);
        final EditText etEmail=(EditText)findViewById(R.id.et_email);
        final EditText etUsername=(EditText)findViewById(R.id.et_username);
        final EditText etPassword=(EditText)findViewById(R.id.et_password);
        final Button btnSignup=(Button)findViewById(R.id.btn_singup);
    }
}
