package mathSoln;

public class anothermethod {
	
	public anothermethod(String name) {
		String rabin = name;
		System.out.println("My name is" + rabin);
	}
	

	public static void main(String [] args) {
		anothermethod myRabin = new anothermethod("hunter");
		try {
			myRabin.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
	}
