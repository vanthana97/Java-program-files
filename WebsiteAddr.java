package stringpkg;

public class WebsiteAddr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="https://wwwgoogle.in";
      String regex="(http|https)://www\\.[a-zA-Z0-9]{2,122}\\.[a-z]{2,3}";
      System.out.println(s.matches(regex));
     
	}

}
