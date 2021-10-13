package practiceProgramming;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		String name="Mississippi";
		name=name.toLowerCase();
		
		char arr[]=name.toCharArray();
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) { 
		
			int j;
		   for(j=0;j<i;j++) { 
			   
			   if(arr[i]==arr[j]) { 
				   break;
				   
			   }
			 }
		   if(j==i) { 
				 
				 arr[index++]=arr[i];
			 }
			
			
		}
		
		System.out.println(String.valueOf(Arrays.copyOf(arr, index)));

	}

}
