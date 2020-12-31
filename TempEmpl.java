package inheritdemo;

public class TempEmpl extends Employee{
  public int insent;
  public int contractp;
public TempEmpl(int empno, String empname, int bs,int insent,int contractp) {
	super(empno, empname, bs);
	this.insent=insent;
	this.contractp=contractp;
}
public double calcsal()
{
	return bs+insent;
}
@Override
public String toString() {
	return "TempEmpl [insent=" + insent + ", contractp=" + contractp + ", empno=" + empno + ", empname=" + empname
			+ ", bs=" + bs + "]";
}
@Override
public double calctax()
{ 
	double f=calcsal();
   return f*0.10;
}

}
