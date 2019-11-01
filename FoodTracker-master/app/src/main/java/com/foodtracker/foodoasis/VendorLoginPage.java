package com.foodtracker.foodoasis;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class VendorLoginPage extends Fragment {

    private EditText email, password;
    private Button LoginBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate view for this fragment
        View view = inflater.inflate(R.layout.fragment_vendor_login_page, container, false);
        email = view.findViewById(R.id.login_vendor_email);
        password = view.findViewById(R.id.vendor_password);
        LoginBtn = view.findViewById(R.id.btn_Register);

        //setting listener for login button
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to run login
            }
        });

        return view;


    }
}
