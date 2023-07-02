import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      //char a[]=new char[s1.length()];
     // StringBuffer sb=new StringBuffer(s1);
      String a1[]=s1.split(" ");
      int i=0,n=a1.length;
      
    
      for(i=n-1;i>=0;i--)
      {
    	  System.out.print(a1[i]+" ");
      }
      
      
	}

}
