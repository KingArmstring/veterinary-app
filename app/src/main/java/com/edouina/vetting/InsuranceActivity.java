package com.edouina.vetting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class InsuranceActivity extends AppCompatActivity {

    //the onCreate method as known is the first method to be executed in any Activity which is the main building block in Android.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting the screen to full screen.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //attaching the ui
        setContentView(R.layout.activity_insurance);
    }
}