package com.examly.springapp.ioc;

public class Student {
    private int rollNo;
    private String name;
    

 Student(){   }

public int getRollNo(){
    return rollNo;
}

public void setRollNo(int rollNo){
    this.rollNo=rollNo;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}

public String getMessage(){
    return "Roll NO "+rollNo+" Name: "+name;
}

}
