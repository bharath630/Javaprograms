
	import java.util.Scanner;

	public class complexNo {

		public static void main(String[] args) {
			// DO Auto-generated method stub
	      Scanner sb=new Scanner(System.in);
	      Complex rl=new Complex();
	        rl.add();
	      rl.sub();
		}

	}
	  class Complex{
		  Scanner sb=new Scanner(System.in);
		  int rp1=sb.nextInt();
	      int ip1=sb.nextInt();
	      int rp2=sb.nextInt();
	      int ip2=sb.nextInt();
		void add()
		{
			int addrp=rp1+rp2;
			int addip=ip1+ip2;
			System.out.println("result"+addrp+"+"+addip+"i");
		}
		void sub()
		{
			int subrp=rp1-rp2;
			int subip=ip1-ip2;
			System.out.println("result of sub"+subrp+"+"+subip+"i");
		}
	}

