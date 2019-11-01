package com.foodtracker.foodoasis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;

public class VendorLogin extends AppCompatActivity {

    public static PreConfig prefConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_login);

        prefConfig = new PreConfig(this);

        //setting up back button (causing crashes right now for some reason)
        //ActionBar actionBar = getActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);

        /*if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }
            if(prefConfig.readLoginStatus()){
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new VendorLoginPage()).commit();
            } else {
                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container. new ()).commit();
            }
        }
*/
    }
}
