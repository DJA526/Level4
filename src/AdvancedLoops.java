
public class AdvancedLoops {
	
	public static void main(String[] args) {
		operatorsBackwards(50);
	}
	
	public static void operatorsBackwards(int n) {
		while (n > 0) {
			if (n % 2 == 0) {
				n /= 2;
				System.out.println("A");
			} else {
				n -= 1;
				n /= 2;
				System.out.println("B");
			}
		}
	}
}
