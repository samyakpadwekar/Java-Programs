package Assgn4;

import java.util.Scanner;

public class Que1 {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print("Enter element	:	");
					arr[ row ][ col ] = sc.nextInt();
				}	
				System.out.println();
			}
		}
	}
	private static void showRecord(int[][] arr) {
		if( arr != null ) {
			for( int[] i : arr ) {
				for( int j : i ) {
					System.out.print(j+"	");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = new int[ 4 ][ ];
		arr[ 0 ] = new int[ 4 ];
		arr[ 1 ] = new int[ 3 ];
		arr[ 2 ] = new int[ 2 ];
		arr[ 3 ] = new int[ 1 ];
		
		Que1.acceptRecord(arr);
		
		
		Que1.showRecord(arr);
	}

	}


