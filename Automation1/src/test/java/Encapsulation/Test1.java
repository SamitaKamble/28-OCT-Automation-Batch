package Encapsulation;

public class Test1 {
	//IMP - Encapsulation is also called as Data Hiding
	
	//Private data variable cannot access directly from Outside the class
	
	private	int IDnumber; //Accessibilty with in class only as private modifier
	private String EmpName ; // Only declared
	private int EmpAge;
	public static void main(String[] args) {
	
		
//         OOPS :-
//		1. Inheritance
//		2. Polymorphism
//		3. Abstraction
//		4. Encspsulation
		
		//Data Member
		//Variable,members
		// Imp Encapsulation
		
	//private	int IDnumber;  // Can't crate it in Main
		//method it shows error invalid Modifier , need to create
		//outside of method
		
		//As variables are NonStatic we need to create an object for them.
		Test1 T1 = new Test1();
		
		T1.setIDnumber(1234);
		T1.setEmpName("Radha Rani"); //Set se values sirf set kiya hai
		T1.setEmpAge(22);
		
		System.out.println("Emp ID is "+T1.getIDnumber() ); //1234 //value use karna padega toh get hoga
		System.out.println("Emp Name is "+T1.getEmpName() ); //Radha Rani
		System.out.println("Emp Age is "+T1.getEmpAge() ); //22
		
		
	}
	
	//you have to initialize the variable with help of getter and setter method, u can generate method automatically
	
	
	//Setter and getter method is Non-static and Public so we can access in different class
	//to access in diff Class we have to create Setter and getter method with accessibility Public
	public int getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(int IDnumber) {
		this.IDnumber = IDnumber;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {  //set karna hai means input dalna hai
		EmpName = empName;
	}
	public int getEmpAge() {   // get karna hai means return lena hai
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	
	
}
