package com.edouina.vetting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class DoctorsActivity extends AppCompatActivity {

    /**
     * The first method to be executed once the application navigates to this Activity(DoctorsActivity)
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hiding the toolbar and the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vetting);
    }


    /**
     * button handler callback method
     * @param view -> represents the button, if we need to exert any change programmatically on the
     *             button, we can use the 'view' reference to accomplish that.
     */
    public void searchDoctorsButton(View view) {
        //when the button is clicked this method will be executed.
    }

}