import java.util.Scanner;

public class Anagram{
    static boolean isAnagram(String a, String b) {
        // Complete the function
       // char c[]=new char[100];
       // char d[]=new char[100];
     char[] c=new char[a.length()];
    char[] d=new char[b.length()];
    if(a.length()!=b.length())
    {
    	return false;
    }
    for(int i=0;i<a.length();i++)
    {
        c[i]=a.charAt(i);
    }
    for(int j=0;j<b.length();j++)
    {
        d[j]=b.charAt(j);
    }
    for(int i=0;i<a.length();i++)
    {
         for(int j=0;j<a.length();j++)
         
             if(c[i]>c[j])
             {
                 char temp=c[i];
                 c[i]=c[j];
                 c[j]=temp;
             }
         
    }
   
     for(int i=0;i<b.length();i++)
    {
         for(int j=0;j<b.length();j++)
         
             if(d[i]>d[j])
             {
                 char temp=d[i];
                 d[i]=d[j];
                 d[j]=temp;
             }
         
    }
     // Arrays.sort(d);
      int t=0;
      for(int i=0;i<c.length;i++)
      {
              if(c[i]==d[i])
              t=1;
              else
              t=0;

      }
      System.out.println(c);

      System.out.println(d);
    if(t==1)
    return true;
    else
    return false;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
    }
}