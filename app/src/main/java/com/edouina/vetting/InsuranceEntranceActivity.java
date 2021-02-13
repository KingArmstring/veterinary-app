package com.edouina.vetting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class InsuranceEntranceActivity extends AppCompatActivity {

    //declaring textView variable.
    TextView tvClaimsAndVetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setting the screen to full screen.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //connecting the ui layout design.
        setContentView(R.layout.activity_insurance_entrance);

        //fetching the TextView
        tvClaimsAndVetting = findViewById(R.id.insurance_text);

        //applying onClick listener for the textView so that when the user clicks on that text,
        //the application navigates the user to the next screen.
        tvClaimsAndVetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigating to the next screen upon the user-click.
                Intent intent = new Intent(InsuranceEntranceActivity.this, InsuranceActivity.class);
                startActivity(intent);
            }
        });

    }
}