import java.util.*;
public class first {
	 static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=-1;
	   while(t!=0) {
	    System.out.println("Enter option");
	    t=s.nextInt();
	    int t2=0;
	    t2=s.nextInt();
	    if(t2==1)
	    add();
	    else if(t2==2)
	    remove();
	    else
	    display();
	   }

	}
	public static void add()
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		al.add(n);
	}
	public static void remove()
	{
		al.remove(al.size()-1);
	}
	public static void display()
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(Integer.parseInt(i+""))+" ");
		}
	}

}
