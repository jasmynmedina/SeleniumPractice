
public class Array {

	public static void main(String[] args) {
		int[] num = new int[7];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		int[] num1 = {3, 4, 10, 11};
		for(int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
	}
}