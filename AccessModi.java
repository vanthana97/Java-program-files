package modifiers;

public class AccessModi {
    private int p1;
    public int p2;
    protected int p3;
    int p4;
    static int s1;
    private void test()
    {
    	System.out.println("Inside Test method");
    }
    public void public_test()
    {
    	System.out.println("Inside public test");
    }
    public static void first_method()
    {
    	System.out.println("In first");
    }
    void default_method()
    {
    	System.out.println("In default");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=10;
     AccessModi a1=new AccessModi();
     a1.test();
     a1.public_test();
     a1.default_method();
     System.out.println(a1.p1);
     System.out.println(a1.p2);
     System.out.println(a1.p3);
     System.out.println(a1.p4);
     System.out.println(i);
     first_method();
     s1=100;
     System.out.println(s1);
	}

}
