import java.util.*;
public class Similar_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1[]=new String[10];
String s2[]=new String[10];
int n=s.nextInt();
for(int i=0;i<n;i++) {
	s1[i]=s.next();
	s2[i]=s.next();
}
//if(s1==s2)
	//  return a[1];
int k=n;
String a="",b="",c="",d="";
while(k<0) {

for(int i=0;i<n;i++) {
	for(int j=0;j<s1[i].length()/2;j++) {
	a=s1[i].substring(0,s1[i].length()/2);
	b=s1[i].substring(s1[i].length()/2,s1[i].length());
	}
}
	for(int i=0;i<n;i++) {
		for(int j=0;j<s1[i].length()/2;j++) {
		c=s2[i].substring(0,s2[i].length()/2);
		d=s2[i].substring(s2[i].length()/2,s2[i].length());
		}
	}
	k--;
}
	


if(a==c||b==d)
	System.out.println("Equal");  //return array a[1]
else
	System.out.println("Not equal");

	}

}
