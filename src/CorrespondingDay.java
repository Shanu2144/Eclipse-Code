import java.util.Scanner;
public class CorrespondingDay {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the date");
		int n=m.nextInt();
		
		if (n==1)
			System.out.println("Sunday");
		else if (n==2)
			System.out.println("Monday");
		else if (n==3)
			System.out.println("Tuesday");
		else if (n==4)
			System.out.println("Wednesday");
		else if (n==5)
			System.out.println("Thrusday");
		else if (n==6)
			System.out.println("Friday");
		else if (n==7)
			System.out.println("Saturday");
		else
			System.out.println("Invalid date");

	}

}
