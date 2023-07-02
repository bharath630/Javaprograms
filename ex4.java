import java.util.*;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  String s1=s.next();
  ArrayList<String> al=new ArrayList<String>(Arrays.asList(s1));
  ArrayList<Integer> at=new ArrayList<Integer>();
 al.add(s1);
 for(int i=0;i<al.size();i++)
 {
	 int a,b;
	 String s2=al.get(i);
	 switch(s2)
	 {
	 case "+": a=at.remove(i-1);b=at.remove(i-1);at.add(a+b);
	 default : at.add(Integer.parseInt(s2));
	 }
 }
  
  
	}

}
