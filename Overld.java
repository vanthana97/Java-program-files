package modifiers;

public class Overld {
    public int doAdd(int no1,int no2)
    {
    	return no1+no2;
    }
    public int doAdd(int no1,int no2,int no3)
    {
    	return no1+no2+no3;
    }
    public float doAdd(float no1,float no2)
    {
    	return no1+no2;
    }
    public float doAdd(float no1,int no2)
    {
    	return no1+no2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Overld o=new Overld();
       System.out.println(o.doAdd(7, 8));
       System.out.println(o.doAdd(89.2f,98.03f ));
       System.out.println(o.doAdd(9, 10, 18));
       System.out.println(o.doAdd(9.6f,10));
	}

}
