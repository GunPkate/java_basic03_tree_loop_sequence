
public class loop6 {
	public static void main(String[] args) {		
		int n =10;
		for(int b = 9; b >=0; b--) {
			for(int i =n*2; i >=0; i--) {				
				if(i < b )
				System.out.print("-");
				else {
					System.out.print("x");					
				}
			}
		System.out.print("\n");
		}
	}
}
