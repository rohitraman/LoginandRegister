package com.example.hp.loginandregister;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Activity_Change_Username_And_Password extends Fragment {

    EditText etChangeUsername,etChangePassword;
    Button btnOK;

    public Activity_Change_Username_And_Password() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_activity__change__username_and_password, container, false);
        etChangeUsername=(EditText)rootView.findViewById(R.id.et_changeusername);
        etChangePassword=(EditText)rootView.findViewById(R.id.et_changepassword);
        btnOK=(Button)rootView.findViewById(R.id.btn_ok);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(),Activity_Login.class);
                SharedPreferences sharedPreferences=getActivity().getSharedPreferences("Details", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("username",etChangeUsername.getText().toString());
                editor.putString("password",etChangePassword.getText().toString());
                editor.apply();
                getActivity().startActivity(intent);
            }
        });
        return rootView;

    }

}
