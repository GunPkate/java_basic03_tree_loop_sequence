
public class B9 {
	public static void main(String[] args) {
		int b;
		for(b = 1; b <=100; b++) {
			if((b%5 ==0 || b%3 ==0) && b%15 != 0) System.out.print(b+"\n");
		}
	}
}
