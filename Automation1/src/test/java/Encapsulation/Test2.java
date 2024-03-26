package Encapsulation;

public class Test2 {

	public static void main(String[] args) {
		
		
		Test1 T2 = new Test1();
		
	    T2.setIDnumber(222);//Value assaign hogi get Method ko or get method call kare variavle ko jisme EMPNAME, EMPID hai
		T2.setEmpName("Madhu Rani");
		T2.setEmpAge(21);
		
		//Varible toh private hai but accessible hai other class k liye by using setter() and getter() Method
		
		
		System.out.println("Emp IDNumber-->"+T2.getIDnumber());
		System.out.println("Emp EmpName-->"+T2.getEmpName());
		System.out.println("Emp EmpAge-->"+T2.getEmpAge());
		
		//Creating all data members and variables as a Private and generate getter and setter method,
		//we can access it outside the class
		
		//How to access the private member - variable outside the class?
		//By using getter and setter method		
		
	
		
	}

}
