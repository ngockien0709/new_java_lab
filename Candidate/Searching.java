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
public class Searching {

    //Search function with first name, last name and type of candidate
    public static void searchCandidate(ArrayList<Candidate> ac) {

        printListNameCandidate(ac);

        System.out.println("-------- Search candidate --------");

        System.out.println("enter name");
        String name = Validate.getInputString().toLowerCase();
        System.out.println("enter type : ");
        int type = Validate.getInputLimit(0, 2);
        
         //loop begin at first candidate element, come to next candidate element 
        //and stop at last candidate element
        for (int i = 0; i <ac.size(); i++) {
             if (ac.get(i).getTypeOfCandidate() == type && ac.get(i).getLastName().toLowerCase().contains(name)
                    || ac.get(i).getFirstName().toLowerCase().contains(name)) {
                System.out.println("The candidates found:");
                System.out.println(ac.get(i));
            }
        }
    }

    public static void printListNameCandidate(ArrayList<Candidate> ac) {
        System.out.println("Experience Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Experience) {// display name of experience candidate
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("Fresher Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Fresher) {// display name of fresher candidate
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("Internship Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Internship) {// display name of intership candidate
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
