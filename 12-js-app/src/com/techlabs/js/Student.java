package com.techlabs.js;

public class Student extends Human {
	int roll_no;
    int grad_year;
    Human human;

    public Student(String gender,int age,String name,int roll_no,int grad_year){
    	super(gender,age,name);
        
        this.roll_no=roll_no;
        this.grad_year=grad_year;
        this.human=new Human(gender,age,name);

    }
    public void display(){
        System.out.println(this);
    }
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", grad_year=" + grad_year + ", human=" + human + "]";
	}
    

}
