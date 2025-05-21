public class ArraysDemo {
	public static void main(String[] args) {
		
		// Array Declaration
		int[] arr;

		// Array Inialization
		arr = new int[5];

		// Storing values based on index position of array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// Accessing the values based on index position
		for (int x = 0; x < arr.length; x++){
			System.out.println(x + " index position of value is : " + arr[x]);
		}
		
	}
}