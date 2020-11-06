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
public class Experience extends Candidate {

    private int expInYear;
    private String proSkill;

    public Experience() {
    }
    
    public Experience(int expInYear, String proSkill, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeOfCandidate) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, typeOfCandidate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }
    // create experience candidate
    public void creatExp(ArrayList<Candidate> ac, Candidate candidate) {
        System.out.println("-------- Experience candidate --------");
        
        super.getInputCandidate(ac,0);
        
        
        System.out.print("enter exp: ");
        int exp = Validate.checkInputOfEXP(candidate.getBirthDate());
        System.out.print("enter proskill: ");
        String proskill = Validate.getInputString();
     
        System.out.println("Create Experience candidate success");
    }

}
