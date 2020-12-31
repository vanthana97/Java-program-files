package stringpkg;

public class RegExStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String ab="1@g.com";
     String regex="[A-Za-z]*[0-9]@[a-z].com";
     System.out.println(ab.matches(regex));
     String regex1="(91)*\\d{10}";
     String ab1="9123456789";
     System.out.println(ab1.matches(regex1));
     String pass="^(?=.*[0-9])(?=.*[A-Z])(?=.*@).{8,12}$";
     String usepa="0Vanthana&";
     System.out.println(usepa.matches(pass));
	}

}
