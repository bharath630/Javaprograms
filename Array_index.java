
public class Array_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,90,90,90,90,104,222};
		int key=10;
		
		
		int store=-1;
 for(int i=0;i<arr.length;i++) {
	 if(arr[i]>=key)
		 break;
	 else if(arr[i]<key)
		 store=i;
	 
 }
	
	 System.out.println(store);
 
	}

}
