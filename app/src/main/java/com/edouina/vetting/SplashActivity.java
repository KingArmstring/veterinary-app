package com.edouina.vetting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.rbddevs.splashy.Splashy;

public class SplashActivity extends AppCompatActivity {

    /*
    The application uses the famous lib Splashy from github to inflate nice splash screen with nice Animation.
     */


    //Any Android Activity starts at the onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting the screen to full screen.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //setting the layout
        setContentView(R.layout.activity_main);

        //calling the splash action
        splash();
    }

    //the splash action.
    public void splash() {
        Splashy s = new Splashy(this)
            .setLogo(R.drawable.ic_veterinarian) //setting the logo
            .setTitle("Vetting Doctors")//
            .setSubTitle("Book a vetting, it can't be easier")
            .setBackgroundColor(R.color.baby_blue) // changing the background color
            .setSubTitleColor("#444444")
            .setTitleColor(R.color.colorAccent)
            .showProgress(true)//Adding progressBar
            .setProgressColor(R.color.colorAccent) //changing the color of the added progressBar
            .setAnimation(Splashy.Animation.SLIDE_IN_LEFT_BOTTOM, 2000)
            .setFullScreen(false)
            .setDuration(3000);////animation duration
        s.show();// start animation

        //setting on complete callback.
        Splashy.Companion.onComplete(new Splashy.OnComplete() {
            @Override
            public void onComplete() {
                //after animation finishes we need to move to the Vetting screen
                startActivity(new Intent(
                    SplashActivity.this,
                    InsuranceEntranceActivity.class
                ));
                
                //killing this activity
                finish();
            }
        });
    }
}