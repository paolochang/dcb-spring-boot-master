package com.paolochang;

public class Nurse implements Staff {
    private String shift;
    public void assist() {
        System.out.println("Nurse is assisting");
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
