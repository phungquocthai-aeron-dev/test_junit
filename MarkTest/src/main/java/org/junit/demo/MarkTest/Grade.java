package org.junit.demo.MarkTest;

public class Grade {
	public String printInWords(float mark) {
		
		if(mark >= 2.00 && mark <= 2.99) return "Fail";
		
		else if(mark >= 3.00 && mark <= 3.49) return "Poor";
		
		else if(mark >= 3.50 && mark <= 4.49) return "Good";
		
		else if(mark >= 4.50 && mark <= 5.49) return "Very good";
		
		else if(mark >= 5.50 && mark <= 6.00) return "Excellent";
		
		else return "";
	}
	
}
