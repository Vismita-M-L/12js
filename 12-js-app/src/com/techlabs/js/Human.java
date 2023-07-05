package com.techlabs.js;

public class Human {
	 String gender;
	    int age;
	    String name;

	    Human(String gender,int age,String name){
	        this.gender=gender;
	        this.age=age;
	        this.name=name;
	    }
	    public void display(){
	        System.out.println(this);
	    }
		@Override
		public String toString() {
			return "Human [gender=" + gender + ", age=" + age + ", name=" + name + "]";
		}
	    
	    
	}


