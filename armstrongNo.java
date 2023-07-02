
	import java.util.Scanner;
	public class armstrongNo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Scanner a=new Scanner(System.in);
	      int i,sum=0,temp;
	      int n=a.nextInt();
	      temp=n;
	      while(n>0)
	      {
	    	  int c=n%10;
	    	  sum=sum+(c*c*c);
	    	  n=n/10;
	      }
	      if(sum==temp)
	      {
	    	  System.out.println("YEs");
	      }
	      else
	      {
	    	  System.out.println("No");
	      }
		}

	}

