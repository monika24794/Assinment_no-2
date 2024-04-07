package assignment;

public class EvenandOdd {

	public static void main(String[] args) 
	{
		int even=0,odd=0;
		int [] arr = new int [] {1,90,34,89,7,9}; 
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2==0)
			{
				even++;
			}
			else
				odd++;
		}
		
    System.out.println("EVEN COUNT OF ELEMENT IN ARRAY :"+even);
    System.out.println("ODD COUNT OF ELEMENT IN ARRAY  :"+odd);
	}

}
