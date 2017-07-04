package com.example.hp.loginandregister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);
        EditText tvEmail=(EditText)findViewById(R.id.et_email);
        TextView etForgotpassword=(TextView)findViewById(R.id.tv_forgotpassword);

    }
}
