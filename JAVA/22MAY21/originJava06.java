
public class originJava06 {

	public static void main(String[] args) {
		
		// ���ڿ� ���ڿ� 
		
		char ch = 'A';
		// char ch1 = 'AA';  char ������ �ΰ� �̻��� ���ڸ� ������ ��� ������ ��
		
		String ch2 = "ABC"; // �ΰ� �̻��� ���ڸ� �����ϱ� ���ؼ��� String ������ ���
		
		String s1 = "A" + "B";
		System.out.println(s1);
		
		String S2 = "" + "B";
		System.out.println(S2);  
		
		// �̰� Ȱ���Ͽ� ���ڸ� ���ڿ��� �ٲ� �� �ִ�. (���ڿ��� ���ڰ� �������� ������ ���ڰ� ���ڿ��� �ٲ�� ������ ����������)
		
		String S3 = "" + 7 + 7;    // "" + 7 + 7 -> "7" + 7 -> "7" + "7" -> "77"
		System.out.println(S3);
		
		String S4 = 7 + 7 + ""; // 7 + 7 + "" -> 14 + "" -> "14"
		System.out.println(S4);
		
	
		// �� ���� �� ��ȯ�ϱ�
		
		int x = 10, y = 20;  
		int a;   //��Ʈ������ ��� �������� ���� ����� ����
		
		System.out.println("x = " + x);
	    System.out.println("y = " + y);
		System.out.println("�ѤѤѤѤѤѤѤ�");
	    
		a = x;
		x = y;
	    y = a;
	    
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
		
		
		
		// �̷����ؼ� int ���� �ʱ�ȭ�� ���� �޸𸮰� ��� �����Ǵ��� �˾ƺ� �� �־���. 
	    
		
		
		
		
		
		
		
		

	}

}
