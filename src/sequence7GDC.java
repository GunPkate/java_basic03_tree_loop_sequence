import java.util.Scanner;

public class sequence7GDC {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int a = 18,b =24;
		for(int i = a; i> 0; i--) {
			if(a % i ==0 && b % i ==0) {
				System.out.print(i);
				break;
			}
		}
	}
}
