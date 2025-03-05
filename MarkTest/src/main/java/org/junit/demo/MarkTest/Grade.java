package org.junit.demo.MarkTest;

public class Grade {
	public String printInWords(float mark) {
		
		if (mark >= 2.00f && mark <= 2.99f) return "Fail";
       
		else if (mark >= 3.00f && mark <= 3.49f) return "Poor";
        
		else if (mark >= 3.50f && mark <= 4.49f) return "Good";
        
		else if (mark >= 4.50f && mark <= 5.49f) return "Very good";
        
		else if (mark >= 5.50f && mark <= 6.00f) return "Excellent";
		
		else return "";
	}
	
}
