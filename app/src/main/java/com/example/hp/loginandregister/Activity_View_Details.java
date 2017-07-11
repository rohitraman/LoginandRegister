package com.example.hp.loginandregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity_View_Details extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.v("Message","LOL");
        View rootView= inflater.inflate(R.layout.fragment_activity_view_details, container, false);
        TextView tvViewDetailsPassword=(TextView)rootView.findViewById(R.id.tv_password);
        TextView tvViewDetailsUsername=(TextView)rootView.findViewById(R.id.tv_username);
        TextView tvViewDetails=(TextView)rootView.findViewById(R.id.tv_viewdetails);
        TextView tvUsername=(TextView)rootView.findViewById(R.id.tv_showusername);
        TextView tvPassword=(TextView)rootView.findViewById(R.id.tv_showpassword);
        return rootView;
    }



}
