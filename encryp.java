import java.util.*;
public class encryp {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       String s1="iffactsdontfittotheorychangethefacts";
       s1=s1.replaceAll("\\s","");
       String s2="";
       String s3="";
     int n=s1.length();
     int m=(int)Math.sqrt(n);
     System.out.println(m);
      int p=m+1;
      int k=0;
      System.out.println(s1);
     for(int i=0;i<m;i++){
     for(int j=i;j<s1.length();j=j+m) {
        s2=s2+s1.charAt(j);
     }
     s2=s2+" ";
     }
        System.out.println(s2);
        
     
        
      }
    }
