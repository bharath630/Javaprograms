import java.util.*;
public class Sorting {
public static void main(String args[]) {
	int a[]={2,4,6,7};
	int b[]={1,3,5,7};
int i=0,j=0;
int k=0;
int arr[]=new int[a.length+b.length];
while(i<a.length&&j<b.length) {
	if(a[i]<b[j])
	{
		arr[k++]=a[i++];
	}
	else
		arr[k++]=b[j++];
}
if(i<a.length)
{
	while(i<a.length) {
		arr[k++]=a[i++];
	}
}
else if(j<b.length) {
	while(j<b.length) {
		arr[k++]=b[j++];
	}
}
	for(k=0;k<arr.length;k++) {
		System.out.print(arr[k]+" ");
	}
}
}
