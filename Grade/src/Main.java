import java.util.Scanner;

public class Main {
	
public static void main(String[]args) {
	Scanner s= new Scanner(System.in);
	float eng,math,com,hin,sci;
	System.out.println("English");
	eng = s.nextFloat();
	System.out.println("math");
	math = s.nextFloat();
	System.out.println("computer");
	com = s.nextFloat();
	System.out.println("hindi");
	hin = s.nextFloat();
	System.out.println("science");
	sci = s.nextFloat();
	
	float average = (eng+math+com+hin+sci)/5;
	System.out.println("total average ="+ average);
	if(average == 100) {
		System.out.println("EXCELLENT");
	}
	else if(average >= 90) {
		System.out.println("VERY GOOD");
	}
	else if(average >= 70) {
		System.out.println("GOOD");
	}
	else if (average >= 60) {
		System.out.println("PASS");
	}
	else{
		System.out.println("FAIL");
	}
	
	
	
}
}
