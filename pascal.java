import java.util.*;
public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=13;
 System.out.println((fact(12))*13);
	}
	   static long fact(int p){
	        int f=0;
	        if(p==0)
	            return 1;
	        else
	        {
	            return fact(p-1)*p;
	        }
	    }
}
