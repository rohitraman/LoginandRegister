package com.example.hp.loginandregister;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        final TextView txt3=(TextView)findViewById(R.id.textView2);
        final EditText et3=(EditText)findViewById(R.id.editText);
        final EditText et4=(EditText)findViewById(R.id.editText5);
        final EditText et5=(EditText)findViewById(R.id.editText3);
        final EditText et6=(EditText)findViewById(R.id.editText4);
        final Button btn4=(Button)findViewById(R.id.button);

    }
}
