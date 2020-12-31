package stringpkg;

public class NoofLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0,ct1=1;
     String s1="     hello   WORLDA Iaknewo to year\n\ni am indian";
     System.out.println(s1);
     
     char arr[]=s1.toCharArray();
     for(int i=0;i<arr.length;i++)
	   {
    	  if((arr[0]!=' ' && i==0)||arr[i]=='\n' || (arr[i]==' ' && ( (arr[i+1]>='A' && arr[i+1]<='Z') || (arr[i+1]>='a' && arr[i+1]<='z')) ) )
    	  {
    		  ct=ct+1;
    		  if(arr[i]=='\n')
        		  ct1=ct1+1; 
        	 
    	  }
    	       		   
    	
    	    }
	   
     System.out.println("Number of words is "+ct);
     System.out.println("Number of lines is "+ct1);
	}

}
