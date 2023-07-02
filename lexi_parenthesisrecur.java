import java.util.*;
public class lexi_parenthesisrecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=6;
  String str[]=new String[n];
  int cc=0;
  int oc=0;
  int idx=0;
  f(str,cc,oc,idx,n);
	}
	
  static void f(String str[],int cc,int oc,int idx,int n) {
	   if(idx==n) {
		   for(int i=0;i<n;i++)
			   System.out.print(str[i]+" ");
		   return;
	   }
	   if(idx<n/2) {
		   str[idx]="(";
		   f(str,cc+1,oc,idx+1,n);
		   
	   }
	   if(oc<cc) {
		   str[idx]=")";
		   f(str,cc,oc+1,idx+1,n);
	   }
   }
}
