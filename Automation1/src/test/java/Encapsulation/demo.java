package Encapsulation;

import org.testng.annotations.Test;

public class demo {

	@Test
	public  void M1() {
		System.out.println("Hello");
		
		//When main method only there then it will shown run AS java
		//or elese it will shown run AS TestNG
		}
	
	
	@Test
	public  void M2() {
		
		int i =10;
		System.out.println(i/0);
		System.out.println("Hello");
	}
}
