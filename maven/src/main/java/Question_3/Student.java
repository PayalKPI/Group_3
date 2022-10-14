package Question_3;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class Student {

		
		public String name () {
			return "john";
		}
		public int roll() {
			return 20;
		}
		
		public int math() {
			return 80;
		}
		
		public int sci() {
			return 85;
		}
		
		public int phy() {
			return 68;
		}
		
		public int eng() {
			return 88;
		}
		public int his() {
			return 90;
		}
		public int chem() {
			return 79;
		}
		
		
		
		public static void main(String[] args) {
			Student s = new Student();
			
		    String ans = s.name(); 
		    System.out.println("My name is john"); 
		    int m1 =s.roll(); 
		    System.out.println("My roll number is 20"); 
		    int m2 = s.math();
			System.out.println("My math mark : 80"); 
			int m3 = s.sci();
			System.out.println("My sci mark: 85"); 
			int m4 = s.phy();
			System.out.println("My phy mark: 68"); 
			int m5 = s.eng();
			System.out.println("My eng mark : 88"); 
			int m6 = s.his();
			System.out.println("My history mark: 90"); 
			int m7 = s.chem();
			System.out.println("My chem mark: 79");
			 
		
			
		
	}

	
	}


