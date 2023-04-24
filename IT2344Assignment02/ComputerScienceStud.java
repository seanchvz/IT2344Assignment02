/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
// Define a new class named "ComputerScienceStud" that extends the "Student" class, inheriting all of its fields and methods
public class ComputerScienceStud extends Student {   //  inherits all the fields and methods of "Student"

    // Define the private fields of the "ComputerScienceStud" class
    private double msca; // fields that corresponds to its purpose 
    private boolean inProbation;

    public ComputerScienceStud(double wpa, double msca, boolean inProbation) {
        super(wpa);
        this.msca = msca; // Set the value of the "msca" field to the value of the "msca" argument passed to the constructor
        this.wpa = wpa; // Set the value of the "wpa" field inherited from the parent class to the value of the "wpa" argument passed to the constructor
        this.inProbation = inProbation; // Set the value of the "inProbation" field to the value of the "inProbation" argument passed to the constructor
    }

 // Define a public method named "status" that returns a String representing the status of the computer science student
        public String status() {
        // If the computer science student has a WPA below 80 and an MSCA grade below 80, and is in probation, they will be advised to shift
        if (wpa < 80 && msca < 80 && inProbation == true) {
            return "advised to shift";
        // If the computer science student has a WPA below 80 and an MSCA grade above or equal to 80, and is not in probation, they will be put under probation
        } else if (wpa < 80 && msca >= 80 && inProbation == false) {
            return "under_probation";
        // If the computer science student has a WPA above or equal to 80 and an MSCA grade below 80, and is not in probation, they will be put under probation
        } else if (wpa >= 80 && msca < 80 && inProbation == false) {
            return "under_probation";
        // Otherwise, the computer science student is retained in the term, but has to prove that they can be retained
        } else {
            return "retained";
        }
    }
   
}
