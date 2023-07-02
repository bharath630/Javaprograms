import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
 
 int n=s.nextInt();int a[]=new int[n];
 int t=0,i;
 for( i=0;i<n;i++)
 {
	 a[i]=s.nextInt();
 }
 int b[ ]=new int[100];
 
 for(i=0;i<n;i++)
 {
	 b[a[i]]++;
 }

 int lar=b[0],loc=0;
 for(i=0;i<100;i++)
 {
	 if(b[i]>0&&b[i]>lar)
	 {
		 lar=b[i];
		 loc=i;
	 }
	// System.out.print(b[i]);
 }
 
 System.out.println(loc);

}

}
