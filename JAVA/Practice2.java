
public class Practice2 {

	public static void main(String[] args) {
		
		
		// 30APR21 �����ڿ� ���� ����
		/*
		 *  =�� ���п����� �����ʰ� ������ ���� ���ٶ�� ��������
		 *  ���α׷������� �ٸ���. �����ʰ��� ���ʿ� �����Ѵٴ� �ǹ��̴�.
		 *   ���п����� =�� ���α׷����� == �̴�. 
		 */
		
		int x = 10;
		int y = 20;
		
	
		
		System.out.println("x = " + x);
		System.out.println("x + y = "+ ( x + y));
		System.out.println("x - y = "+ ( x - y));
		System.out.println("x * y = "+ ( x * y));
		System.out.printf("x / y = "+ ( x / y ));
		System.out.println("\nx % y = "+ ( x % y));
		
		
		//���� ���Կ�����
		
	
				
		System.out.println(" x += 10 :  " + (x += 10));
		System.out.println(" x -= 10 : " + (x -= 10));
		System.out.println(" x *=  10 : " + (x *= 10));
		System.out.println(" x %= 10 : " + (x %= 10));
		System.out.println(" x /= 10 :  " + (x /= 10));
	   
		
		//���迬����
		 
		System.out.println(" x =! y : " + ( x !=  y ));
	  
		// ����������
		/* 
		 *  ++ 1��ŭ ���� 
		 *  -- 1��ŭ ����
		 *   
		 *   ����� x = 10 
		 *   ++x = 11
		 *   --x = 9 
		 *   �ٸ� �̰� ���ӿ����ڿ� ���ؼ���
		 *  x-- = 10
		 *  x++ = 10 
		 *  �̴� ���ӿ����ڶ�� ���ε� �޸𸮿��� ������� ���� ���� �̸� ����������
		 *  �׷��⿡ �� �ڿ� ������ x�� ���� x++ = 11�� ������ x-- = 9�� ���´�. 
		 */
		
		
		//��������
		boolean b1 = false;
		boolean b2 = true; 
		
		System.out.println("b1 &&  b2 : " + (b1 && b2));
		System.out.println("b1 ||  b2 : " + (b1 || b2));
		System.out.println(" !b1 : " + (!b1));
		
		
		//���ǻ�Ȳ ������
	 
		x = 10; y = 20;
		int result  =  0;
		result = ( x  >  y) ? 100 : 200; 
		System.out.println("result = " + result);
		
		result = ( x < y ) ? 100 : 200;
		System.out.println("result = " + result);
		
		result = ( x==y ) ? 100 : 200;
		System.out.println ("result  = " + result);
		
		
	}
}
