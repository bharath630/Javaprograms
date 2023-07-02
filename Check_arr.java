import java.util.*;
public class Check_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,2,4,4,6};
 int b[]= {2,4};
 for(int i=0;i<a.length;i++) {
	 for(int j=0;j<b.length;j++) {
		 if(a[i]==b[j]) {
			 b[j]=0;
		 }
	 }
 }
 int c=0;
 for(int j=0;j<b.length;j++) {
	 if(b[j]!=0) {
		 c=1;
	 }
 }
 if(c==0)
	 System.out.println("True");
 else
	 System.out.println("False");
	}

}
