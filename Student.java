package modifiers1;

public class Student {
    int rollno,totalmarks;
    public Student(int rollno, int totalmarks, String name) {
		//super();
		this.rollno = rollno;
		this.totalmarks = totalmarks;
		this.name = name;
	}
	String name;
    public void calcperc()
    {
    	float perc=totalmarks/8;
    	System.out.println("Percentage is "+ perc);
    }
    public void printdetails()
    {
    	System.out.println("Name is "+name);
    	System.out.println("Roll no is "+rollno);
    }
	@Override
	public String toString() {
		return "rollno=" + rollno + ", totalmarks=" + totalmarks + ", name=" + name ;
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student(int rollno) {
		super();
		this.rollno = rollno;
	}
	public Student() {
		super();
	}
	public static void main(String[] args) {
	
        Student s=new Student();
       
        s.calcperc();
        Student s1=new Student(13,"anu");
        
        s1.calcperc();
        Student s2=new Student(14,455,"priya");
        float avg=(s.totalmarks+s1.totalmarks)/2;
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(avg);
	}

}