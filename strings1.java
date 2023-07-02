import java.util.*;
public class strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 String s1=s.next();
 
	 if(s1.charAt(0)=='x'&&s1.charAt(s1.length()-1)=='x')
	 System.out.print(s1.substring(1,s1.length()-1));
	 else
		 System.out.println(s1);
 
	}

}
