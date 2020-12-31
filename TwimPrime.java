package modifiers1;

public class TwimPrime {
	public static void Prime(int num)
    {
   	 int no=num;
   	 for(int i=1;i<=no;i++)
	  {
   		 for(int j=i+1;j<=no;j++)
   		 {
          if(isPrime(i) && isPrime(j))
          {
   	        System.out.println("("+i +","+j+")");
            break; 
           }
     
   		 }
	  } 
  
   	 }
	 public static boolean isPrime(int num)
     {
    	 int no=num;
    	 boolean prime=true;
		for(int j=2;j<=no/2;j++)
    		{
    			if(no%j==0)
    			{
    				prime=false;
    				break;
    			}
    			else
    				prime=true;
    			
    		}
		return prime;
     }		
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime(50);
		
	}

}
