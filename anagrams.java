import java.util.Scanner;

public class anagrams{
static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
        return false;
        else{
        char ch[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        for(int i=0;i<a.length();i++){
        	for(int j=i+1;j<a.length();j++) {
            if(ch[j]<ch[i])
            {
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=t;
            }
        	}
        }
        for(int i=0;i<a.length();i++){
        	for(int j=i+1;j<a.length();j++) {
            if(ch2[j]<ch2[i])
            {
                char t=ch2[i];
                ch2[i]=ch2[j];
                ch2[j]=t;
            }
        	}
        }
          for(int i=0;i<a.length();i++)
        	  System.out.print(ch[i]+" ");
          for(int i=0;i<a.length();i++)
        	  System.out.print(ch2[i]+" ");
        int t=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch2[i])
            t=1;
        }
        if(t==0)
        return true;
        else 
        return false;
        }
      }
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String a = "anagram";
    String b = "margana";
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
     