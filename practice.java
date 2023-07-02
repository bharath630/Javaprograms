import java.util.*;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String a[]=new String[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=s.next();
    }
    ArrayList<String> ar=new ArrayList<String>(Arrays.asList(a));
    String ele=s.next();
    ar.add(ele);
   
    ar.add("bk");
    System.out.println(ar);
	}

}
