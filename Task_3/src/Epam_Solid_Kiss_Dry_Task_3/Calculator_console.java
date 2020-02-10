package Epam_Solid_Kiss_Dry_Task_3;
import java.util.*;
public class Calculator_console {
static Scanner sc = new Scanner(System.in);
	public static List<Double> getInput(){
		double a,b;
		System.out.println("Enter first number");
		a = sc.nextDouble();
		System.out.println("Enter second number");;
		b = sc.nextDouble();
		List<Double> res = new ArrayList<Double>();
		res.add(a);
		res.add(b);
		return res;
	}
	public static void main(String[] args) throws Exception{
		int select = 0;
		List<Double> list = null;
		do {
			System.out.println("Select!");
			System.out.println("1.\tAdd");
			System.out.println("2.\tSubtract");
			System.out.println("3.\tMultiply");
			System.out.println("4.\tDivide");
			System.out.println("5.\tExit");
			select = sc.nextInt();
			switch(select) {
			case 1:
				list = getInput();
				System.out.println(Calculator.add(list.get(0),list.get(1)));
				break;
			case 2:
				list = getInput();
				System.out.println(Calculator.substract(list.get(0),list.get(1)));
				break;
			case 3:
				list = getInput();
				System.out.println(Calculator.multiply(list.get(0),list.get(1)));
				break;
			case 4:
				list = getInput();
				System.out.println(Calculator.divide(list.get(0),list.get(1)));
				break;
			case 5:
				System.out.println("Thankyou!");
				break;
			default:
				System.out.println("Enter the input between 1 to 5");
				break;
			}
		}
		while(select != 5);
	}

}
