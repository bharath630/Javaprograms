import java.util.*;
public class to_fr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   int n=5;
   String s1="toioynnkpheleaigshareconhtomesnlewx";
	String s2="";
	String s3="";
	String s4="";
	int m=s1.length()/n,i=0;
	int k=1;
	while(k<=m) {
		if(i<s1.length())
		s2=s1.substring(i,5+i);
		if(k%2!=0)
			s2=s2;	
		else {
			StringBuffer sb=new StringBuffer(s2);
			s2=sb.reverse()+"";
	       }
		s4=s4+s2;
	
		i=i+5;
		k++;
	 }
	System.out.println(s4);
	int j=0;
	i=0;
  while(j<s1.length()/5) {
	  while(i<s1.length()) {
		  if(i<s1.length())
	       s3=s3+s1.charAt(i);
	 i=i+5;
	  }
	  i++;
	  j++;
	  
  }
  System.out.println(s3);
	
	}

}
