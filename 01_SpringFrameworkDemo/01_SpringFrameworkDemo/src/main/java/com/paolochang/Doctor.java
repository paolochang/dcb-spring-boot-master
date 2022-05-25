package com.paolochang;

public class Doctor implements Staff {
    private String qualification;

    // inject by the constructor
    public Doctor(String qualification) {
        this.qualification = qualification;
    }
    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
