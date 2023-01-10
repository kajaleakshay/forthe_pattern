package acept_theuser_input;

import java.util.Scanner;

public class acept_theinput
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("entre the num 1");
		int s2 = s1.nextInt();
		
		System.out.println("entre the next or second int");
		int s3 = s1.nextInt();
		
		System.out.println(s2+s3);
		
		System.out.println("----");
		
		System.out.println("entre the String value : ");
		String s4 = s1.next();
		int s6 = s4.length();
		System.out.println(s6);
		
		
		
		
		
	}

}
