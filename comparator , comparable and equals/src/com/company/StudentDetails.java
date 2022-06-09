package com.company;

import java.util.Comparator;

public class StudentDetails implements Comparable {
    private int id;
    private String name;
    private long phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public StudentDetails(int id , String name , long phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public boolean equals(Object obj){
        StudentDetails std = (StudentDetails) obj;
        return (this.id==std.id && this.name.equals(std.name) && this.phoneNumber==std.phoneNumber);
    }

   @Override
    public int compareTo(Object o) {
        StudentDetails std = (StudentDetails) o;
        if (this.id < (std.id) ) {
            return -1;
        }
        else if(this.id > std.id){
            return 1;
        }
        else{
            return 0;
        }


    }
}
