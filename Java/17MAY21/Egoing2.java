
public class Egoing2 {
	public static void main(String[] args) {
		
		// Making Auth App
		
		System.out.println(args[0]);
		
		String id = "Egoing";
		String inputID = args[0];
		
		String pass = "1111";
		String inputpass = args[1];
		
		System.out.println("Hello.");
	
//		if (inputID.equals(id)) {
//			   if (inputpass.equals(pass)) {
//				   System.out.println("Master");   
//				   }
//		        }	else  {
//			       System.out.println("Boss"); 
//			    }
		
		
		// ���� �ִ� �ΰ��� if ���ǹ��� && �����ڷ� �������μ� �ڵ� �� ȿ�������� ���� �� �ִ�. 
		// use && to make code more shorter and efficient  than the before 
		
		       if (inputID.equals(id) && inputpass.equals(pass)) {
		    	   System.out.println("Master"); 
		    	   
		       } else  {
			       System.out.println("Boss"); 
			    }
		
		    
		    
 
	}
}

		    
		    