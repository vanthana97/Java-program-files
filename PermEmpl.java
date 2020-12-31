package inheritdemo;

public class PermEmpl extends Employee {
@Override
	public String toString() {
		return "PermEmpl [insent=" + insent + ", bonus=" + bonus + ", empno=" + empno + ", empname=" + empname + ", bs="
				+ bs + "]";
	}
public int insent;
public int bonus;
public double calcsal()
{ 

	return (bs+insent+bonus);
}
public PermEmpl(int empno, String empname, int bs,int insent,int bonus) {
	super(empno, empname, bs);
	this.insent=insent;
	this.bonus=bonus;
}
@Override
public double calctax()
{ 
	double f=calcsal();
   return f*0.5;
}


}
