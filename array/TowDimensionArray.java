package array;

public class TowDimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3}, {4, 5, 6}}; //new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println("==");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		} 
		
		System.out.println("==");
		
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		/*
		System.out.println(alphabets.length);
		System.out.println(alphabets[12].length);
		*/
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++, ch++) {
				alphabets[i][j] = ch;
				System.out.println(alphabets[i][j]);
			}
		}

	}

}
