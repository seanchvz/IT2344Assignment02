/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class ManagementEngineeringStud extends Student {

    private boolean inProbation;
    private boolean failedGrade;

    public ManagementEngineeringStud(double wpa, boolean inProbation, boolean failedGrade) {
        super(wpa); // calls the constructor of the parent class "Student" with the wpa parameter
        this.wpa = wpa; 
        this.inProbation = inProbation; 
        this.failedGrade = failedGrade;
        
    }

    @Override
    public String status() {
        // status is retained until proven otherwise 
        //if student has wpa above 89, retained
        if (wpa > 89 && inProbation == false) {
            return "retained";
        // if student has a wpa between 87 and 88.9, in probation
        } else if (wpa >= 87 && wpa <= 88.9 && inProbation == false) {
            return "under_probation";
        // if student has a wpa below 87 and a failing grade, advised to shift
        } else if ((failedGrade == true) || (wpa<= 87) ||(wpa>=87 && wpa<=88.9 && inProbation==true)) {
            return "advised_to_shift";
        // if the previous conditions do not apply, the student is advised to shift. 
        } else {
            return "advised_to_shift";
        }
    }
}