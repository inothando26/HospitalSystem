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
    
    //allows controlled access to private fields
    public String getPatientID() { //returns the value 
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getFirstName() {
        return FirstName;
    }
    
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    
    public String getLastName() {
        return LastName;
    }
    
    public void setLastName(String LastName ) {
        this.LastName = LastName;
    }
    
     public int getAge() {
         return age;
     }
     
     public void setAge(int age) { //age must be positive , if not throw an exception and stop
         if(age <= 0) {
             throw new IllegalArgumentException("Age must be greater than 0.");
         }
         this.age = age;
     }
     
     public void setGender(String gender) {
         this.gender = gender;
     }
     
     public String getMedicalCondition() {
         return medicalCondition;
     }
     
     public void setMedicalCondition(String medicalCondtition) {
         this.medicalCondition = medicalCondition;
     }
     
     public PatientCategory getCategory() {
         return category;
     }
     
     public void setCategory(PatientCategory category){
         this.category = category;
     }
     
     
     public void displayDetails() { //method will be overridden by inpatient
         System.out.println("Patient ID            :" + patientID); //Prints all patients details to the cosole 
         System.out.println("Name                  :" + FirstName + " " + LastName);
         System.out.println("Age                   :" + age);
         System.out.println("Gender                :" + gender);
         System.out.println("Medical Condition     :" + medicalCondition);
         System.out.println("Category              :" + category);
     }
    
    
    
    
}
