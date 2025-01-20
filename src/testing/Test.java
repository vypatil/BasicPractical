package testing;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1 = new Address(1111, "kop");
		
		Employee e1 = new Employee(1, "vaibhav", a1);
		
		System.out.println(e1);
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println(e2);
		
		System.out.println(e1==e2);
		
		
		
	}

}
