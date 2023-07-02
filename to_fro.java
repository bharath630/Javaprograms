import java.util.*;
public class to_fro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		while(n!=0){
		 String s1=s.next();
		String s2="";
		String s3="";
		String s4="";
		int m=s1.length();
	  char ch[]=s1.toCharArray();
	  char ch1[][]=new char[s1.length()][n];
	  int k=0;
	  for(int i=0;i<=s1.length()/n;i++) {
		  s3="";
	for(int j=0;j<n;j++) {
		if(k<s1.length()) {
	  ch1[i][j]=s1.charAt(k);
		 s3=s3+ch1[i][j];
		}
	    k++;
	    }
	 if(i%2!=0) {
		 StringBuffer sb=new StringBuffer(s3);
	   s3=sb.reverse()+"";
	    }
	 s4=s4+s3;
	  }
	 // System.out.println(s4);
	 for(int i=0;i<n;i++) {
		 for(int j=i;j<s1.length();j=j+n) {
			s2=s2+s4.charAt(j);
	 }
	}
		System.out.println(s2);
		 n=s.nextInt();
		
		}
		
	}

}
