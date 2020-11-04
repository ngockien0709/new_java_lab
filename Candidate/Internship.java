/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class Internship extends Candidate {

    private String majors;
    private String semester;
    private String university;

    public Internship() {
    }

    public Internship(String majors, String semester, String university, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public String getSemester() {
        return semester;
    }

    public String getUniversity() {
        return university;
    }

    public  void createInternship(ArrayList<Candidate> ac, Candidate candidate) {
        System.out.println("-------- Intern candidate --------");

        super.getInputCandidate(ac, 2);
        
        System.out.println("enter majors: ");
         majors = Validate.getInputString();

        System.out.println("enter semester");
         semester = Validate.getInputString();

        System.out.println("enter university");
         university = Validate.getInputString();

        System.out.println("Create Internship candidate success");
    }

}
