import java.util.*;
import java.lang.*;

class mergesort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0){
			int m=s.nextInt();
			int a[]=new int[m];
			for(int i=0;i<m;i++)
			a[i]=s.nextInt();
			
		  int lo=0,hi=m-1;
		  merge(a,lo,hi);
		}
	}
static void merge(int a[],int lo,int hi){
		if(lo==hi)
		return;
	int mid=(lo+hi)/2;
		  merge(a,lo,mid);
		  merge(a,mid+1,hi);
		  ms(a,lo,mid,hi);
		  
	}
	static void ms(int a[],int lo,int mid,int hi){
		int k=0,p1=lo,p2=mid+1,c=0;
		int temp[]=new int[hi-lo+1];
		while(p1<=mid&&p2<=hi){
			if(a[p1]<=a[p2])
			temp[k++]=a[p1++];
			else{
				c=c+mid-p1+1;
				temp[k++]=a[p2++];
			}
			
		}
		System.out.println(c);
	}
	
}