import java.util.Scanner;

public class loop7Prime3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int count =0;
		for (int i = 1; i <= a; i++) {
			if(a%i ==0) {				
				count++;
//				System.out.println(count);
			}
		}
		if(count == 2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");			
		}
	}
}
