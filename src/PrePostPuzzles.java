
public class PrePostPuzzles {
	
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0; 
		x++;
		y--;
		z += y;
		System.out.println("x1: " + x);
		System.out.println("y1: " + y);
		System.out.println("z1: " + z);
		
		x = 0;		y = 0;		z = 0;
		y = x++;
		z = ++x;
		System.out.println("x2: " + x);
		System.out.println("y2: " + y);
		System.out.println("z2: " + z);
		
		x = 0;		y = 0;		z = 0;
		y = --x;
		z = ++x;
		System.out.println("x3: " + x);
		System.out.println("y3: " + y);
		System.out.println("z3: " + z);
		
		x = 0;		y = 0;		z = 0;
		y *= --x;
		z *= -x;
		System.out.println("x4: " + x);
		System.out.println("y4: " + y);
		System.out.println("z4: " + z);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			}
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);
			}
		
		int i = 0;
		if (++i == 1) {
			System.out.println("7 yay");
		} else
			System.out.println("7 nay");
		
		i = 0;
		if (i++ == 1) {
			System.out.println("8 yay");
		} else 
			System.out.println("8 nay");


	}

}
