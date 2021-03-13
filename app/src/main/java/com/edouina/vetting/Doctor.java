package com.edouina.vetting;

//POJO class Doctor to be used as the model for the doctor.
//it is composed of some fields like name, level, ...etc
public class Doctor {

    private String doctorName;
    private String doctorLevel;
    private String areaOfExpertise;
    private String address;
    private int image;

    public Doctor(String doctorName, String doctorLevel, String address, int image, String areaOfExpertise) {
        this.doctorName = doctorName;
        this.doctorLevel = doctorLevel;
        this.address = address;
        this.image = image;
        this.areaOfExpertise = areaOfExpertise;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorLevel() {
        return doctorLevel;
    }

    public void setDoctorLevel(String doctorLevel) {
        this.doctorLevel = doctorLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }
}
