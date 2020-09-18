package com.arrays;

public class Array2dDemo {

	public static void main(String[] args) {
		/*int arr[][] =new int[4][4]; //[row][col]
		
		arr[0][0]=4;
		arr[0][1]=3;
		arr[0][2]=3;
		arr[3][0]=5;
		arr[2][2]=10;
		*/
		int []arr[]= {{2, 3,5},{4},{1,2},{3,4,5,6}};
		
		/*for(int i=0; i<arr.length;i++) { //rows
			for(int j=0; j<arr[i].length;j++) {//colums
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		/*for(int []arrRow:arr) {
			for(int a:arrRow) {
				System.out.print(a +" ");
			}
			System.out.println();
		}*/
		
		String[][]strArr= {{"A","B"},{"C"},{"D"}};
		for(String[] row:strArr) {
			for(String s:row) {
				System.out.println(s);
			}
		}
		
	}
}
