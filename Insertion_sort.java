import java.util.*;
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,5,9,13,22,27,35,46,51,55,83,87,23};
int n=arr.length;
int i=0,j=0,key=0;
for (i = 1; i < n; i++)
{ 
    key = arr[i]; 
    j = i - 1;
    while (j >= 0 && arr[j] > key)
    { 
        arr[j + 1] = arr[j]; 
        j = j - 1; 
        
    } 
    for(i=0;i<n;i++)
    {
    System.out.print(arr[i]+" ");
    }
    arr[j + 1] = key; 
} 

	}

}



/*static void Met(int a[ ])
{
   int i,j,t;
    for(i=0;i<a.length-1;i++)
    {
        if(a[i+1]<a[i])
        {   t=a[i+1];
            for(j=i;j!=-1;j--)
            {
                if(a[j]<t)
                   break;
                else 
                    a[j+1]=a[j];
            }
            a[j+1]=t;
        }
        for(j=0;j<a.length;j++)
            System.out.print(a[j]+" ");
        System.out.println();
    }
}*/

