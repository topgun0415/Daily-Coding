import java.util.*;    //import java.util.Scanner��� �ϸ� �ڹ�->��ƿ ���Ͽ��� ��ĳ�� �ż��常 ����� ����. *�� �� ���Ͽ� ���� 
public class originJava09 {
 public static void main(String[] args) {
	
	 
	
	 // Scanner ����
	 
	  Scanner scanner = new Scanner (System.in);   // Scanner Ŭ������ ��ü�� ����
	  
	  String input = scanner.nextLine(); //�Է¹��� ������ input�� ����

	  
	  //  int num = Integer.parseInt(input); //�Է¹��� ������ input Ÿ���� ������ ��ȯ
	  
	  int num = scanner.nextInt(); // ������ �Է¹޾Ƽ� ���� num�� ����
	  float num2 = scanner.nextFloat();
	 
	  
	  
	 System.out.println("Name : " + input);
	 System.out.printf("Student Number : %d%n", num);
	 System.out.printf("GPA : %.2f%n", num2);
	 
	 
	 
	 
	 
	 
	 
	 
	  
       }
}
