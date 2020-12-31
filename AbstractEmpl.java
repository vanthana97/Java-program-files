package inheritdemo;

public abstract class AbstractEmpl {
  String empname;
  abstract void dowork();
@Override
public String toString() {
	return "AbstractEmpl [empname=" + empname + "]";
}
  
}
