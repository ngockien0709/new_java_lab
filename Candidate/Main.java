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
public class Main {

     public static void menu(){
        System.out.println("1.Experience");
        System.out.println("2.Fresher");
        System.out.println("3.Internship");
        System.out.println("4.Searching");
        System.out.println("5.Exit");
        System.out.print("your choice?: ");
    }
    
    public static void main(String[] args) {
        Candidate candi = new Candidate();
        ArrayList<Candidate> ac = new ArrayList<>();
//        ac.add(new Experience(99, "code", "1", "Pham Ngoc", "Hoa", 1991,
//                "Ninh Binh", "0968038714", "hoapnse05740", 0));
        ac.add(new Fresher(2000, "good", "2", "Đo Quang", "Hiep",
                1995, "Ha Noi", "0984481349", "thaycacac@gmail.com", 1));
        ac.add(new Internship("PRJ311", "Spring", "FPT University",
                "2", "Nguyen Xuan", "Cuong", 2018, "Ha Noi", "0986246813",
                "thaycacacoficial@gmail.com", 2));
        

//        ArrayList<Candidate> candi = new ArrayList<>();
        ac.add(new Experience(4, "Code","1", "a", "hihi", 1999, "hanoi", "0123456789", "ahihi@gmail.com", 0));
        ac.add(new Experience(2, "Code","4", "a", "hehi", 1990, "hanoi", "0123456788", "hehi@gmail.com", 0));
//        ac.add(new Fresher(2019, "good", "FPTU", "2", "i", "hihi", 1999, "hanoi", "1234567890", "ihihi@gmail.com", 1));
//        ac.add(new Intership("PRJ", "fall", "FPTU", "3", "e", "hehe", 1999, "hanoi", "1231231230", "ehehe@gmail.com", 2)); 
        
        
        while (true) {
            menu();
            int choice = Validate.getInputLimit(1, 5);
            switch (choice) {
                case 1:
                    CreateCandidate.createCandidateWithType(0, ac,candi );
                    break;
                case 2:
                    CreateCandidate.createCandidateWithType(1, ac, candi);
                    break;
                case 3:
                    CreateCandidate.createCandidateWithType(2, ac, candi);
                    break;
                case 4:
                    Searching.searchCandidate(ac);
                    break;
                case 5:
                    return;    
            }
        }
    }
}
