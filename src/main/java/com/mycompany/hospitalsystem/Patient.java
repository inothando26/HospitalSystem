/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalsystem;

/**
 *
 * @author emeris
 */
public class Patient {
    
    //Private fields = encapsulation
    private String patientID; //these variables store the patient's data and cannot be accessed directly from outside
    private String FirstName;
    private String LastName;
    private int age;
    private String gender;
    private String medicalCondition;
    private PatientCategory category; //uses enum : inpatient,outpatient, emergency
    
    public Patient(String patientID, String FirstName, String LastName,int age,String gender,
            String medicalCondition, PatientCategory category  ) { //constructor
        
        this.patientID = patientID; //object's fields to avoid confusion with parameter names
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.gender = gender;
        this.medicalCondition = medicalCondition;
        this.category = category;
               
        
    }
    
    
    
    
}
