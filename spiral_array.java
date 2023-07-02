import java.util.*;
public class spiral_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//int a[]=new int[10];
	int a[]= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Enter row size and column size_:");
		int m=s.nextInt();
		//int n=s.nextInt();
		int i=0,k=0,j=0;
		while(k<=m) {
			
		for(i=j;i<m;i++) {
		if(i<a.length)
			System.out.print(a[i]+" ");
		}
		System.out.println();
			for(j=i;j<i+m;j++) {
				if(j<a.length)
				System.out.print(a[j]+" ");
			
		}
			
			k++;
		}

	}

}
