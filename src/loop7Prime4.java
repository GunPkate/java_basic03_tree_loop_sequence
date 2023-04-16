import java.util.Scanner;

public class loop7Prime4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int y = 0; y < a.length; y++) {
			a[y] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++)
				if (a[i] % j == 0) {
					count++;
//					System.out.println(a[i]+" "+j + count);
				}
			if (count == 2) {
				System.out.println((i+1)+" "+a[i]);
			}
		}
//		System.out.println("amount of Prime Number = : "+ count);
	}
}
