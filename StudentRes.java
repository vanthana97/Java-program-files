package modifiers1;

public class StudentRes {
    public static char give_res(int perc)
    {
    	char res;
    	if(perc>=75)
    		 res='D';
    	else if(perc>=60 && perc<75)
    		 res='1';
    	else if(perc>=45 && perc<60)
    		res='S';
    	else if(perc>=35 && perc<45)
    		res ='T';
    	else 
    		res='F';
    	return(res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char gra=give_res(35);
     System.out.println("Grade is "+gra);
	}

}
