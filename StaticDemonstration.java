package day1_assignment;

public class StaticDemonstration {
	static int x= 10;
	static int y;
	
	public static void calculate( int z) {
		int sum =0;
		sum = x+y+z;
		System.out.println(sum);
	}
	static {
		y= x+5;
	}

	public static void main(String[] args) {
		
		calculate(12);
		

	}

}
