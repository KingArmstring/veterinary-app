package com.edouina.vetting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/*
This class purpose is to get the list setup and fill it with the list of Doctors data passed to it via the constructor.
 */
public class DoctorsAdapter extends RecyclerView.Adapter<DoctorsAdapter.MyViewHolder> {

    //List of doctors passed to the RecyclerView
    List<Doctor> doctors;
    //Context to get the profile image resource
    Context context;

    /**
     * RecyclerAdapter constructor
     * @param doctors
     * @param context
     */
    public DoctorsAdapter(List<Doctor> doctors, Context context) {
        //setting the passed variables
        this.doctors = doctors;
        this.context = context;
    }

    /**
     * creating a view object out of the layout passed, then creating a ViewHolder out of that view
     */
    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new MyViewHolder(
            LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false)
        );
    }

    /**
     * Setting the data in the different views i.e.:
     *      setting the name in the proper textView
     *      setting the level
     *      setting image
     *      setting address
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        //setting the name data in the ui xml object
        holder.txtName.setText(doctors.get(position).getDoctorName());
        //setting the doctor level
        holder.txtLevel.setText(doctors.get(position).getDoctorLevel());
        //setting address
        holder.textAddress.setText(doctors.get(position).getAddress());
        //setting the image
        holder.imgProfile.setImageDrawable(ContextCompat.getDrawable(context, doctors.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        //the adapter needs to know the number of elements that will be placed in the list, it is equal to the number of items of the data.
        return doctors.size();
    }

    //The ViewHolder which is the building block for each list item, it defines how each list item will look like.
    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProfile; // imageView.
        TextView txtName; // TextView for the name of the doctor.
        TextView txtLevel; // TextView for the level of the doctor.
        TextView textAddress; //TextView for the address of the doctor.

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            //initializing the imageView for the profile image
            imgProfile = itemView.findViewById(R.id.img_cover);

            //init the textView for the name of the doctor.
            txtName = itemView.findViewById(R.id.doctor_name);

            //init the textview for the level of the doctor.
            txtLevel = itemView.findViewById(R.id.doctor_level);

            //init the address of the doctor.
            textAddress = itemView.findViewById(R.id.doctor_address);
        }
    }
}
