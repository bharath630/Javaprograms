import java.util.*;
public class duplicates_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]= {"aa","aa","bb","nn","aa","bb","bb","bb","bb","kk","hh","aa","bb"};
		int num = 1;

		for (int j=0;j<s1.length;j++) {
		     for (int i = j; i < s1.length; i++) {
		          if (s1[j].equals(s1[i])&&i!=j) {
		              num++;
		              break;
		          }
		     }
		}
	  System.out.println(num);

	}

}
