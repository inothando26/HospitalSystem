/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalsystem;

/**
 *
 * @author emeris
 */
public class Ward {
    
    private static final int ROWS = 4; //constant for number of rows in ward
    private static final int COLS = 5; //constant number of columns in the ward
    
    private Bed[][] beds; //2D array to store bed objects representing the physical layout
    
    public Ward() {
        beds = new Bed[ROWS][COLS]; //starts the 2D array with 4 rows and 5 columns
        
        int bedCounter =1; //counter to name beds
        
        for(int i = 0; i < ROWS; i++) { //outer loop which loops through each row from 0 to 3
           for(int j = 0; j < COLS; j++) { //inner loopwhich loops through each column from 0 to 4
               
               String bedNumber = String.format("B%02d", bedCounter); //format bed number as B01, B02, with leading zero
               
               beds[i][j] = new Bed(bedNumber); //creates a new bed object and places it at pposition [i][j]
               bedCounter++; //increase counetr for next bed
               
           }
        }
    }
    
    public String allocatedBed(String patientID) { //method to find a free bed and assign it to a payient 
        
        for(int i = 0; i < ROWS; i++) { //loops through all rows to find empty bed
            for(int j = 0; j < COLS; j++) { //loops through all columns in current row
                
                if(!beds[i][j].isOccupied()) { //checks if current bed is not occupied 
                    
                    beds[i][j].setOccupied(true); //mark bed as occupied
                    beds[i][j].setPatientID(patientID); // link patient ID to this bed
                    
                    return beds[i][j].getBedNumber(); //return the bed number that was allocated
                    
                }
            }
            
        }
        return null; //ward is full
        
    }
    public boolean releaseBed(String bedNumber) { //method to free a bed when patientis discharged
        
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLS; j++) {
                
                if(beds[i][j].isOccupied()) { //checks if bed is currently occupied
                    beds[i][j].setOccupied(false); //marks it as free
                    beds[i][j].setPatientID(null); //remove patient ID link
                    
                    return true;
                }
                return false; //bed exists but it was already empty
            }
        }
        
    }
    return false; //bed number not found
}

public void  displayWardLayout() { //method to print the visual layoutof the ward
    
    System.out.println("\n===== WARD LAYOUT (X = Occupied, 0 = Available) =====");
    
    for(int i = 0; i < ROWS; i++) {
        for(int j = 0; j < COLS; j++) {
            
            String status = beds[i][j].isOccupied()? "X" : "0";
            
            System.out.println(beds[i][j].getBedNumber() + "[" + status + "]");
        }
        System.out.println();
    }
    
}
