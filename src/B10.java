
public class B10 {
	public static void main(String[] args) {
		int i;
		int[] a = {3,5,7};
		for(i = 1; i <=1000; i++) {
			for(int y = 1; y <a.length;y++) {
//				if(!(i%3 == 0 && i%5 == 0 && i%7 == 0)) {
					if(i%a[y] == 0 && i%a[y-1] == 0) System.out.print(i+"\n");
					if(y == 2) {						
						if(i%a[y] == 0 && i%a[y-2] ==0) System.out.print(i+"\n");
					}
//				}
			}
		}
	}
}
