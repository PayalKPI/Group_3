package Question_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
	@Test
	public void Student() {
		Student s1 = new Student();
		String ans = s1.name();
		assertEquals("john", ans);
		System.out.println("My name is : " + ans);
		
		Student s2 = new Student();
		int ans1 = s2.roll();
		assertEquals(20, ans1);
		System.out.println("My roll number is :" + ans1);
		
		
		Student s3 = new Student();
		int ans2 = s3.math();
		assertEquals(80, ans2);
		System.out.println("My math mark :" + ans2);
		
		Student s4 = new Student();
		int ans3 = s4.sci();
		assertEquals(85, ans3);
		System.out.println("My science mark :" + ans3);
		
		Student s5 = new Student();
		int ans4 = s5.phy();
		assertEquals(68, ans4);
		System.out.println("My physics mark :" + ans4);
		
		Student s6 = new Student();
		int ans5 = s6.eng();
		assertEquals(88, ans5);
		System.out.println("My english mark : " + ans5);
		
		Student s7 = new Student();
		int ans6 = s7.his();
		assertEquals(90, ans6);
		System.out.println("My history mark : " + ans6);
		
		Student s8 = new Student();
		int ans7 = s8.chem();
		assertEquals(79, ans7);
		System.out.println("My chemistry marki: " + ans7);
		
		
	}
	

}
