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
public class Fresher extends Candidate {

    private int graduationDate;
    private String graduationRank;

    public Fresher() {
    }

    public Fresher(int graduationDate, String graduationRank, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }
    // create fresher candidate
    public void createFresher(ArrayList<Candidate> ac, Candidate candidate) {
        System.out.println("-------- Fresher candidate --------");

        super.getInputCandidate(ac, 1);
        
        
        System.out.println("enter graduationDate ");
        graduationDate = Validate.chekGraduationDate(birthDate);

        System.out.println("enter graduationRank: ");
        graduationRank = Validate.getInputString();

        System.out.println("Create Fresher Candidate success");
    }

}
