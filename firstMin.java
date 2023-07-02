import java.util.*;
public class firstMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {10,14,16,20,13,15,9,16,21,10};
 Stack<Integer> st=new Stack<Integer>();
int b[]=new int[a.length];
 for(int i=0;i<=a.length-1;i++)
 {
	 while(!st.empty()&&a[st.peek()]<a[i])
	 {
		 
		 st.pop();
	 }
	 st.push(i);
	 b[i]=a[st.peek()];
	
 }
 for(int i=0;i<a.length;i++)
	 System.out.print(a[i]+" ");
 }

}
