package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<StudentDetails> students = new ArrayList<>();
        StudentDetails student1 = new StudentDetails(10,"zouli",9492779196l);
        StudentDetails student2 = new StudentDetails(9,"mouli",8492779196l);
        StudentDetails student3 = new StudentDetails(11,"aouli",7492779196l);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(student1.equals(student2));

        

     /*  Comparator<StudentDetails> nameCompare = new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                if (o1.getName().equals(o2.getName())){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }; */



     //   Collections.sort(students ,nameCompare);

      /*  for(StudentDetails s : students){
            System.out.println(s.getId()+" " + s.getName()+" "+s.getPhoneNumber());
        } */

       Comparator<StudentDetails> phoneCompare = new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                if (o1.getPhoneNumber()>o2.getPhoneNumber()){
                    return 1;
                }
                else if(o1.getPhoneNumber()< o2.getPhoneNumber()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        };

        Collections.sort(students ,phoneCompare);

        for(StudentDetails s : students){
            System.out.println(s.getId()+" " + s.getName()+" "+s.getPhoneNumber());
        }

        student1.compareTo(student2);
    }
}

