package Array;
//2*2 Matrix //doubts

public class arr3 {

	public static void main(String[] args) {
		int x[][] = {{1,2,3},{2,3,4},{3,4,5}};
		for(int i =0; i<3; i++) {
			for(int j =0;j<3;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		for(int a[]:x) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}
