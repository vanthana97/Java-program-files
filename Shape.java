package modifiers;

public class Shape {
    public double calcArea(int radius)
    {
    	return 3.145*radius*radius;
    }
    public int calcArea(int len,int bred)
    {
    	return len*bred;
    }
    public float calcArea(float bas,float heit)
    {
    	return 0.5f*bas*heit;
    }
    public double calcPerim(int radius)
    {
    	return 2*3.145*radius;
    }
    public double calcPerim(int len,int bred)
    {
    	return 2*(len+bred);
    }
    public float calcPerim(float a,float b,float c)
    {
    	return a+b+c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape s=new Shape();
      System.out.println("Area of circle is "+s.calcArea(8));
      System.out.println("Area of rectangle is "+s.calcArea(10, 9));
      System.out.println("Area of triangle is "+s.calcArea(10.0f, 12.09f));
      System.out.println("Perimeter of circle is "+s.calcPerim(10));
      System.out.println("Perimeter of rectangle is "+s.calcPerim(10, 9));
      System.out.println("Perimeter  of triangle is "+s.calcPerim(10.0f, 12.09f,19.0f));
	}

}
