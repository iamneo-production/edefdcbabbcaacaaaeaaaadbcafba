package com.examly.springapp.ioc;

public class Student {
    private int rollNo;
    private String name;
    private int year;

 public Student(){   }

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

public void getMessage(){
    System.out.println("Roll NO: "+this.rollNo+" Name: "+this.name+" Year: "+this.getYear());
}


public void setYear(int year){
    this.year=year;
}

public int getYear(){
    return year;
}

}
