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

    public static void searchCandidate(ArrayList<Candidate> ac) {

        printListNameCandidate(ac);

        System.out.println("-------- Search candidate --------");

        System.out.println("enter name");
        String name = Validate.getInputString().toLowerCase();
        System.out.println("enter type : ");
        int type = Validate.getInputLimit(0, 2);
//        for (Candidate c : ac) {
//            if (c.getTypeOfCandidate() == type && c.getLastName().toLowerCase().contains(name)
//                    || c.getFirstName().toLowerCase().contains(name)) {
//                System.out.println("The candidates found:");
//                System.out.println(ac.toString());
//            }
//        }
        
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
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("Fresher Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("Internship Candidate");
        for (Candidate candidate : ac) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
