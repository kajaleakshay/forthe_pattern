package pallindrome;

public class example5_pallindrome 
{
	public static void main(String[] args) 
	{
		 String ori = "madam";
		 
		 String rev = "";
		// when we compare the string used equals method
		// when we copare the int then used the ==	
 
		 for(int i=ori.length()-1;i>=0;i--)
		 {
		//	rev= ori.charAt(i);
			// System.out.print(ori.charAt(i));
			 
			 rev=rev+ori.charAt(i);
		 }
		 System.out.println(ori);
		 System.out.println(rev);
		 if(ori.equals(rev))
		 {
			 System.out.println("it is pallindrome string ");
		
		 }
		 else
		 {
			 System.out.println("it is not pallindrome string");
		 }
		 
		 
		 
		 
		 
	}
	

}
