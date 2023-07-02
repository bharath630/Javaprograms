import java.util.*;
public class potti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,j,k,l,m;
   for(i=1;i<=5;i++)
   {
	   for(j=5;j>=i;j--)
	   System.out.print(" ");
	   for(k=1;k<=i;k++)
		   System.out.print("*");
	   for(l=1;l<=i;l++)
		   System.out.print("*");
	   for(m=4;m>=i;m--)
		   System.out.print(" ");
	   for(k=1;k<=i;k++)
		   System.out.print("*");
	   for(l=1;l<=i;l++)
		   System.out.print("*");
	  
	  //System.out.println("");
	}
 /*for(i=10;i>=1;i--)
 {
	 for(j=10;j>=i;j--)
	 {
		   System.out.print(" ");
		   for(l=1;l<=i;i++)
			   System.out.print("*");
		   for(m=i;m>=2;m--)
			   System.out.print("*");
		   System.out.println();
	 }
 }*/
	   System.out.print("___________  POTTI(ish)  ___________");
	   
 
}
}