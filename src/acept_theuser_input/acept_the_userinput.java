package acept_theuser_input;

import java.util.Scanner;

public class acept_the_userinput
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("provide the first input value :");
		int x1 = s1.nextInt();
		
		System.out.println("provde the second int value  :");
		int x2 = s1.nextInt();
		
		System.out.println(x1-x2);
		
		System.out.println("-----");
		
		
		
		
	}
}
