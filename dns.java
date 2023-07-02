import java.net.InetAddress;
import java.util.*;
public class dns{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=1;
		while(t==1)
		{
			System.out.println("Enter t");
			t=s.nextInt();
			try {
			if(t==1)
			{
				String s2=s.next();
				InetAddress ap;
				ap=InetAddress.getByName(s2);
				System.out.println("name "+ap.getHostName());
				System.out.println("name "+ap.getHostAddress());
				
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
		}
	}
}