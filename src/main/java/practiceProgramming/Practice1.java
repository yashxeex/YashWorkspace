package practiceProgramming;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Emerging Lead";
		
		name=name.replace(" ", "");
		
		System.out.println(name);
		
		name=name.toLowerCase();
		
		System.out.println(name);
		
		char arr[] = name.toCharArray();
		
		int count;
		
		for(int i=0;i<arr.length;i++) { 
			
			count=1;
			
           for(int j=i+1;j<arr.length;j++)  { 
        	 
			if(arr[i]==arr[j]) { 
				 
					count++;
					
					arr[j]='0';
					
				}
				
			}
			
			if(count>1 && arr[i]!='0')
				
				System.out.print(arr[i]);
			
		}

	}

}
