/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class IT2344Assignment02 {

    /**
     * @param args the command line arguments
     */
    // Test for the classes
    public static void main (String[] args) {
        // COMPUTER SCIENCE
     
        ComputerScienceStud cs_student1 = new ComputerScienceStud(85, 70, true);
        // Print out the student's status by calling the status() method on the cs_student1.
        System.out.println("Computer Science Student: " + cs_student1.status());
        
        ComputerScienceStud cs_student2 = new ComputerScienceStud(90, 70, false);
        System.out.println("Computer Science Student: " + cs_student2.status());
         
        ComputerScienceStud cs_student3 = new ComputerScienceStud(70, 70, false );
        System.out.println("Computer Science Student: " + cs_student3.status());


        //MANAGEMENT ENGINEERING
        // Print out the student's status by calling the status() method on the engStudent1.     
        ManagementEngineeringStud engStudent1 = new ManagementEngineeringStud(100, false , false);
        System.out.println("Management Engineering Student: " + engStudent1.status());
        
        ManagementEngineeringStud engStudent2 = new ManagementEngineeringStud(88, false, false );
        System.out.println("Management Engineering Student: " + engStudent2.status());
         
        ManagementEngineeringStud engStudent3 = new ManagementEngineeringStud(70, false, true);
        System.out.println("Management Engineering Student: " + engStudent3.status());


        // OTHER STUDENT
        OtherStud ostudent1 = new OtherStud(90, true);
        // Print out the student's status by calling the status() method on the Other Student. 
        System.out.println("Other Student: " + ostudent1.status());

        OtherStud ostudent2 = new OtherStud(74, false);
        System.out.println("Other Student: " + ostudent2.status());

        OtherStud ostudent3 = new OtherStud(70, true);
        System.out.println("Other Student: " + ostudent3.status());

    }
}
