
public class WhileLoopPuzzles {
	
	public static void main(String[] args) {
		int money = 1;
		int years = 0;
		while (money < 1000000) {
			money *= 2;
			years++;
		}
		System.out.println(years);
		
		int slices = 1046;
		int cuts = 0;
		while (slices > 1) {
			slices /= 2;
			cuts++;
		}
		System.out.println(cuts);
		
	}

}
