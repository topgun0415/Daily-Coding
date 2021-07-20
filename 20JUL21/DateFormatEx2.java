import java.util.*;
import java.text.*;


public class Main {
	public static void main (String [] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 01, 28);
		
		Date today= cal.getTime();		// Calendar 타입의 을 Date 타입의 today에 형변환 
		
		SimpleDateFormat sdf1 , sdf2 , sdf3 , sdf4;
		
		sdf1 = new SimpleDateFormat ("yyyy - MM - dd");
		sdf2 = new SimpleDateFormat ("yy - MM - dd E요일");
		sdf3 = new SimpleDateFormat ("yyyy - MM - dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat ("yyyy - MM - dd hh:mm:ss a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
			
	}
	
}

 

