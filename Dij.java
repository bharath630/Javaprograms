import java.util.*;
public class Dij {
   static int min=Integer.MAX_VALUE;
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter no of vertices : ");
	   int n=s.nextInt();
	   int a[][]=new int[n+1][n+1];
	   for(int i=1;i<a.length;i++)
	   {
		   for(int j=1;j<a.length;j++)
			   a[i][j]=s.nextInt();
	   }
	   int vis[]=new int[n+1];
	   System.out.println("Enter source : ");
	   int src=s.nextInt();
	   vis[src]=1;
	   for(int i=1;i<a.length;i++) {
		   min=Integer.MAX_VALUE;
	   shortestpath(a,src,vis,0,i);
	      System.out.println("distance from "+src+" to "+i+" is "+min);  
	   }
   }
   public static void shortestpath(int a[][],int src,int vis[],int sum,int dest)
   {
	   if(src==dest)
	   {
		   if(sum<min)
			   min=sum;
		   return ;
	   }
	   for(int j=1;j<a.length;j++)
	   {
		   if(a[src][j]>0 && vis[j]==0)
		   {
			   vis[j]=1;
			   shortestpath(a,j,vis,sum+a[src][j],dest);
			   vis[j]=0;
		   }
	   }
   }
}