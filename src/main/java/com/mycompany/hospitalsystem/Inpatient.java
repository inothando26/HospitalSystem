/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalsystem;

/**
 *
 * @author emeris
 */
public class Inpatient extends Patient { //child class of patient,which will inherit all fields and methods from patient

      
    private int wardNumber; //fields only for inpatients, outpatients do not nedd them
    private String bedNumber; //not assigned until a bed is alloctaed by hospitalService
    
      public Inpatient(String patientID, String FirstName, String LastName, int age, //Constructor for creating a new inpatient object
              String gender, String medicalCondition, int wardNumber) {
          
          super(patientID, FirstName, LastName, age, gender, medicalCondition, PatientCategory.Inpatient); //calls the parent class(Patient) constructor to set the inherited attributes
          
          this.wardNumber = wardNumber; //set fields specific to inpatient
          this.bedNumber = "Not Assigned"; //default value ,no ed given at admission yet
        
    }
      
      public int getWardNumber() {
          return wardNumber;
      }
      
      public void setWardNumber(int wardNumber) {
          this.wardNumber = wardNumber;
      }
      
      public String getBedNumber() { //getter for bedNumber
          return bedNumber;
      }
      
      public void setBedNumber(String bedNumber) {
          this.bedNumber = bedNumber;
      }
      
      @Override //adding extra inpatient info, we are replacing the parent's method
      public void displayDetails() {
          super.displayDetails(); //reuse the parent's method first to print common details
          
          System.out.println("Ward Number       :" + wardNumber);
          System.out.println("Bed Number        :" + bedNumber);
      }
      
         
}
