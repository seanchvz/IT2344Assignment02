/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class OtherStud extends Student {
    private boolean inProbation; // field that corresponds to whether the student is in probation or not

    public OtherStud(double wpa, boolean inProbation) {
        super(wpa); 
        this.wpa = wpa;
        this.inProbation = inProbation;
    }
    @Override
    public String status() {
        //if other student has a wpa below 75 and is in probation, student will be advised to shift
        if (wpa < 75 && inProbation == true) {
            return "advised to shift";
            // if other  student has a wpa below 75 and is not in probation, student will be in probation
        } else if (wpa < 75 && inProbation == false) {
            return "under_probation";
            // Student is retained in the term, but has to prove that the student can be retained.
        } else {
            return "retained";
        }
    }

}
