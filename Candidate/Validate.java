
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J22_Candidate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validate {

    public Validate() {
    }

    static Scanner input = new Scanner(System.in);
    // \\d{10} user must be input 10 number
    // \\d* user can input more number or not
    static String Phone = "^\\d{10}\\d*$";

     /*
    [A-Za-z0-9.-+%]+ user must be input from a-z ignore case,0-9 and .-+% least one times
    @ user must be input "@"
    [A-Za-z.-]+ user mustbe input from a-z ignore case, "." "-" least one times
    \\. user must be input "."
    [A-Za-z]{2,4} user must be input from a-z ignore 2 - 4 times
     */
    static String mail = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    public static int getInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(input.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("re-input: ");
            }

        }
    }

    public static String checkPhone() {
        while (true) {            
          String  s = input.nextLine();
            if(s.matches(Phone)){
                return s;
            }else{
                System.out.println("phone with minimum 10 digit!!!");        
            }
        }
    }
    
    public static boolean checkExistPhone(ArrayList<Candidate> ac,String phone){
        //loop begin at first phone element, come to next phone element 
        //and stop at last phone element
        for (Candidate candidate : ac) {
            //compare phone check with phone of candidate
            if(candidate.getPhone().equalsIgnoreCase(phone)){
                System.out.println("this phone existed ");
                return false;
            }
        }
        return true;
    }

    public static String checkMail() {
        while (true) {            
          String  s = input.nextLine();
          if(s.matches(mail)){
              return s;
          }else{
              System.out.println("re-input mail!!!");
          }
        }
    }
    
    public static boolean checkExistEmail(ArrayList<Candidate> ac,String email){
        //loop begin at first ID element, come to next ID element 
        //and stop at last ID element
        for (Candidate candidate : ac) {
            //compare id check with id of candidate
            if(candidate.getEmail().equalsIgnoreCase(email)){
                System.out.println("this email existed");
                return false;
            }
        }
        return true;
    }
    
    public static String getInputString(){
        while (true) {  //loop until user input correct          
            String s= input.nextLine().trim();
            if(s.isEmpty()){
                System.out.println("not empty");
                System.out.print("re-input: ");
            }else{
                return s;
            }
        }
    }

    public static int checkInputOfEXP(int birthDate) {
        int currrentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currrentYear-birthDate;
        while (true) {     //loop until user input correct       
            int exp = getInputLimit(1, 100);
            if(exp>age){
                System.out.println("Experience must be smaller than age!!!");
            }else{
               return exp;
            }
        }
    }

   

    public String returnRankOfGraduation() {
        while (true) {    //loop until user input correct        
            String s = input.nextLine();
            if(s.equalsIgnoreCase("Excellent")||s.equalsIgnoreCase("Good")
               ||s.equalsIgnoreCase("Fair")
               || s.equalsIgnoreCase("Poor")){
                return s;
            }else{
                System.out.println("please input only Excellent,Good,Fair,Poor");
            }
        }
    }
    //check duplicate id of list candidate
    public static boolean checkExistedCandidateID(ArrayList<Candidate> t, String candidateID) {
        //loop begin at first ID element, come to next ID element 
        //and stop at last ID element
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCandidateID().equalsIgnoreCase(candidateID)) {
                System.out.println("this ID existed!!!");
                return false;
            }
        }
        return true ;
    }
    
    

    public static boolean checkUserChoose(){
        while (true) {   //loop until user input correct         
            String s = getInputString();
            if(s.equalsIgnoreCase("y")){
                return true;
            }else if(s.equalsIgnoreCase("n")){
                return false;
            }
        }
    }
    
    public static int chekGraduationDate(int birthDate){
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        while (true) { //loop until user input correct           
            
            try {
                int input = Integer.parseInt(Validate.input.nextLine());
                if(input<birthDate||input>yearCurrent){
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException n) {
                System.out.println("GraduationDate must be greater than birthdate and smaller than or equal current year");
                System.out.print("re-input GraduationDate: ");
            }
            
        }
    }
    
    
}
