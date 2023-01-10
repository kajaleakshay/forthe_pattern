package acept_theuser_input;

import java.util.Scanner;

public class userinput 
{
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("first interger value:");
		
		int value1 = s.nextInt();
		
		System.out.println("second int value:");
		int value2 = s.nextInt();
		
		System.out.println(value2-value1);
		
		System.out.println("name of the operator:");
		String name = s.next();
		int lenght = name.length();
		System.out.println(lenght);
		
		
	}

}
