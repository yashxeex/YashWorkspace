package practiceProgramming;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="kayak";
		boolean flag=true;
		
	    char arr[]=name.toCharArray();
	    
	    for(int i=0;i<arr.length/2;i++) { 
	    	
	    	if(arr[i]!=arr[arr.length-i-1]) { 
	    		
	    		flag=false;
	    		break;
	    		
	    	}
	    	
	    }
	    
	    if(flag) { 
	    	
	    	System.out.println("String is palindrome");
	    }
	    
	    else { 
	    	System.out.println("String is not palindrome");
	    }
		
	}

}
