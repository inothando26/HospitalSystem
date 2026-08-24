/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalsystem;

/**
 *
 * @author emeris
 */
public class Bed {
    
    private String bedNumber; //stores unique bed identifier
    private boolean occupied;
    private String patientID;
    
    public Bed(String bedNumber) { //constructor that runs when you create a bed with new bed
        this.bedNumber = bedNumber;
        this.occupied = false; //set bed as initially free or not occupied
        this.patientID = null; //set no patient assigned yet therefore it is null
        
    }
    
    public boolean isOccupied() {
        return occupied; //return true if occupied, false if free
    }
    
    public void setOccupied(boolean occupied) { //setter upadtes the occupied status
        this.occupied = occupied;
    }
    public String getPatientID() { //getter returns the ID of the patient occupying this bed
        return patientID; //return the patientID currently linked to this bed
    }
    
    public void setPatientID(String patientID) { //links a patient to this bed or clears it
        this.patientID = patientID; //assigns the patientID to this bed or null when bed is freed
    }
}
