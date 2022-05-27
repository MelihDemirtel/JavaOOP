
public class FourOperation {

	public static void main(String[] args) {
		System.out.println("Summing = "+summing(5,2));
		System.out.println("Extraction = "+extraction(5,2));
		System.out.println("Multiplication = "+multiplication(5,2));
		System.out.println("Division = "+division(5,2));

	}
	
	public static double summing(double a, double b) {
		return a + b;
	}
	
	public static double extraction(double a, double b) {
		return a - b;
	}
	
	public static double multiplication(double a, double b) {
		return a * b;
	}
	
	public static double division(double a, double b) {
		return a / b;
	}

}
