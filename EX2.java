import java.util.*;
public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  String s1=s.next();
  String a[]=s1.split("");
  int n=a.length;
    for(int i=0;i<n;i++)
  {
	  if(a[i]=="+"||a[i]=="-"||a[i]=="*"||a[i]=="/")
		  if(a[i]=="+") {
			  //a[i-2]=Integer.parseInt();
		  a[i]=(a[i-2])+(a[i-1]);
		  System.out.print(a[i]);
		  System.exit(0);

		  }
	 
  }
   
	}

}
