import java.util.Scanner;

public class sequence4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double total = 0;
		for(int i = 1; i<= n; i++) {
			total += 1.0/(i*i);
//			System.out.print(i+" ");
//			System.out.println(total);
		}
		System.out.println(total);
	}
}
