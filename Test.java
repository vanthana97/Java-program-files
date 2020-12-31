package inheritdemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PermEmpl p=new PermEmpl(1234,"anu",12000,2000,3000);
      System.out.println(p);
      System.out.println("Total salary "+p.calcsal());
      System.out.println("tax is "+p.calctax());
      TempEmpl t=new TempEmpl(234,"priya",10000,2000,2);
      System.out.println(t);
      System.out.println("Total salary "+t.calcsal());
      System.out.println("tax is "+t.calctax());
      
	}

	

}
