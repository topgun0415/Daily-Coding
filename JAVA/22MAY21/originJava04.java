
class originJava04 {
public static void main(String[] args) {
	
	//Type of Variable
	
	int age = 25; //int�� ������ ���� ����.. 3.14�� ���� �Ǽ��� �����ϴ� �� �Ұ��� (�Ǽ��� double) 
	char ch = '��';  //Char�� ����Ÿ��
	double pi = 3.14; //double �� �Ǽ� 
	
	System.out.println(ch);
	// Variable & Constant 
	/*
	 * Variable (����) = �ϳ��� ���� �����ϱ� ���� ����, ó���� �ѹ� ���� �����ߴ��� �ٽ� �ٲܼ�����.
	 * Constant (���) = ������ ���������� �ϳ��� ���� �����ϱ� ���� ���������� ó���� �ѹ� ������ ���� �ٸ������� �ٲ��� ����
	 */
	
	int score = 100;
    score = 250;
	System.out.println(score); //�տ��� 100���� ������ ���������� �ڿ��� 250�� �缱�� �߱⶧���� 250�� ������ �����°� ��������.
	
	//����� �����ϱ� ���ؼ��� ������ �տ� final�� �־��ָ� ��������� �����Ҽ�����
	
	final int score1 = 150;
	System.out.println(score1);
	
	score1 = 250; 
	System.out.println(score1);  //���� �������� �����߱⿡ ��¿� ������ ���°� �������� 
	
	
	

	
	
	
	
	
	
	
  }
}
