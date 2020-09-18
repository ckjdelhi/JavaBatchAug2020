package com.arrays;

public class Array3dDemo {

	public static void main(String[] args) {
		/*int [][]arr[] = new int[3][2][2]; //3 x 1 x2 = 6
		
		arr[0][0][0]= 1;
		arr[0][0][1]= 2;
		arr[0][1][0]= 10;
		arr[0][1][1]= 20;
		
		arr[1][0][0]= 3;
		arr[1][0][1]= 4;
		arr[1][1][0]= 30;
		arr[1][1][1]= 40;
		
		arr[2][0][0]= 5;
		arr[2][0][1]= 6;
		arr[2][1][0]= 50;
		arr[2][1][1]= 60;*/
		int[][][]arr = {
				{
					{1,2},{2},{3,4}
				},
				{{1},{2,3}},
				{{1,2,3},{3,4}}
		};
		
		/*for(int i =0; i<arr.length;i++) {//Dimension
			for(int j=0;j<arr[i].length;j++) {//rows
				for(int k=0; k<arr[i][j].length;k++) {//columns
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}*/
		for(int [][] dim: arr) {
			for(int []row: dim) {
				for(int col:row) {
					System.out.print(col +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
