package acept_theuser_input;

import java.util.Scanner;

public class scanner 
{
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("first int of the class  :");
		int x1 = s1.nextInt();
		
		System.out.println("second variable of the class :");
		int x2 = s1.nextInt();
		
		System.out.println(x1+x2);
		
		System.out.println("string of the class  :");
		String x3 = s1.next();
		
		int x4 = x3.length();
		System.out.println(x4);
		
		System.out.println("----");
		System.out.println("entre the float value :");
		 float p1 = s1.nextFloat();
		
		System.out.println("second float value of the float :");
		 float p2 = s1.nextFloat();
		
		System.out.println("additon of the two float value :"+(p1+p2));
		
		System.out.println(p1+p2);
		
		
		
		
		
	}

}
