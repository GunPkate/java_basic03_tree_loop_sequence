
public class loop5 {
	public static void main(String[] args) {		
		int b;
		for(b = 0; b <=9; b++) {
			for(int i =9; i >=0; i--) {				
				if(i > b)
				System.out.print("-");
				else {
					System.out.print("x");					
				}
			}
		System.out.print("\n");
		}
	}
}
