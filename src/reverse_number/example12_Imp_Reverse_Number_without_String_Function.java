package reverse_number;


public class example12_Imp_Reverse_Number_without_String_Function {
	public static void main(String[] args) {

	
		int num = 123;  
		int revNum = 0;     //321
		
			//   123            0>0       123/10 = 12/10=1/10 =0
		for(int i=num;  i>0;       i= i/10) 
		{
			int rem = i % 10;  //    1%10 =1
			revNum = revNum * 10 + rem;      //320 +1 = 321 
		}
		
			
		System.out.println(revNum);

//		while (num > 0)
//		{
//			int rem = num % 10;     
//			
//			revNum = revNum * 10 + rem;    
//			
//			num = num / 10;     
//		}
		
	}
}


