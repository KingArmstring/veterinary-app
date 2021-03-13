package com.edouina.vetting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DoctorsActivity extends AppCompatActivity {

    private RecyclerView rvDoctors;
    private List<Doctor> doctors;

    /**
     * The first method to be executed once the application navigates to this Activity(DoctorsActivity)
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hiding the toolbar and the status bar
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_vetting);
        setupList();
    }


    /**
     * Setting up the list, preparing the adapter and setting the recyclerAdapter to the recyclerView.
     */
    private void setupList() {
        initDoctorsList();
        rvDoctors = findViewById(R.id.rv_doctors);
        rvDoctors.setLayoutManager(new LinearLayoutManager(this));
        DoctorsAdapter adapter = new DoctorsAdapter(doctors, this);
        rvDoctors.setAdapter(adapter);
    }

    /**
     * Preparing the list of doctors, for now most of the data is dummy data.
     */
    private void initDoctorsList() {
        doctors = new ArrayList<>();
        Doctor d1 = new Doctor("name 1", "Junior Resident", "address placeholder", R.drawable.d0, "");
        Doctor d2 = new Doctor("name 2", "Senior Resident", "address placeholder", R.drawable.d1, "");
        Doctor d3 = new Doctor("name 3", "Chief Resident", "address placeholder", R.drawable.d2, "");
        Doctor d4 = new Doctor("name 4", "Intern", "address placeholder", R.drawable.d0, "");
        Doctor d5 = new Doctor("name 4", "Intern", "address placeholder", R.drawable.d0, "");
        Doctor d6 = new Doctor("name 4", "Intern", "address placeholder", R.drawable.d0, "");
        Doctor d7 = new Doctor("name 4", "Intern", "address placeholder", R.drawable.d0, "");
        Doctor d8 = new Doctor("name 4", "Intern", "address placeholder", R.drawable.d0, "");
        Doctor d9 = new Doctor("name 4", "Intern", "address placeholder", R.drawable.d0, "");
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);
        doctors.add(d4);
        doctors.add(d5);
        doctors.add(d6);
        doctors.add(d7);
        doctors.add(d8);
        doctors.add(d9);
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