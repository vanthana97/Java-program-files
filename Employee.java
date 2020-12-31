package inheritdemo;

public class Employee {
public int empno;
public String empname;
public int bs;
public Employee(int empno, String empname, int bs) {
	super();
	this.empno = empno;
	this.empname = empname;
	this.bs = bs;
}
public double calctax()
{
	return 0;
}
}
