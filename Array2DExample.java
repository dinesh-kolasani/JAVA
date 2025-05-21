public class Array2DExample {
	public static void main(String[] args) {

		// Array Declaration and Inialization
		int[][] arr = new int[2][2];

		// Storing values based on index position of array
		arr[0][0] = 900;
		arr[0][1] = 800;
		arr[1][0] = 700;
		arr[1][1] = 600;

		// Accessing the values based on index position with the help of for loop
		for(int x=0; x<2; x++) {
			for (int y=0; y<2; y++) {
				System.out.println(arr[x][y]);
			}
		}

	}
}