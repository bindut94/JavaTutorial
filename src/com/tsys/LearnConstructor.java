package com.tsys;

public class LearnConstructor {
	
	String xyz ;
	String color;
	int size;
	
	public LearnConstructor(String input, String color, int size) {
		   
	    this.xyz = input;
	    this.color = green;
	    this.size = 5;
		
		System.out.println("Hey I have parameterized constructor, Default is gone..Yay!!!" + input, " ", + color, " ", + size);	
		
		}

   
   

	public static void main(String[] args) {	
		
		LearnConstructor secondConstructor = new LearnConstructor("Bindhu");
	        
		
		System.out.println(secondConstructor.xyz);
		System.out.println(secondConstructor.xyz);
		
	}
	
	

}
