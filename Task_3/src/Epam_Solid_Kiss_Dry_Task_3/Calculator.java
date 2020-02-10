package Epam_Solid_Kiss_Dry_Task_3;

public class Calculator {
	public static double add(double a,double b){
		return a + b;
	}
	public static double substract(double a,double b) {
		return a - b;
	}
	public static double multiply(double a,double b) {
		return a * b;
	}
	public static double divide(double a,double b) throws Exception{
		double result = a / b;
		return result;
	}
}
