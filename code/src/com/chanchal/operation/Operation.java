package com.chanchal.operation;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		int operation;
		long set;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of operation & sets with single space delimited");
		String op_set = sc.nextLine();
		String arr[] = op_set.split("\\s+");
		try {
			operation = Integer.parseInt(arr[0]);
			set = Long.parseLong(arr[1]);
			// 1<=N<=50 && 1=<K<=10^9
			if((operation >= 1 && operation <= 50) && (set>= 1 && set <= Math.pow(10, 9))) {
				int[][] nums = new int[operation][2];
				for (int i = 0; i < operation; i++) {
					int k = 0;
					String rows = sc.nextLine();
					String element[] = rows.split("\\s+");
					int ai = Integer.parseInt(element[0]);
					int bi = Integer.parseInt(element[1]);
					// Ai >= 1 && Bi <= 8
					if(ai != bi && (ai >= 1 && ai <= 8) && (bi >= 1 && bi <= 8) ) {
						nums[i][k++] = ai;
						nums[i][k++] = bi;
					}
					else {
						throw new IllegalArgumentException("Ai & Bi must be inequal & values lies in between 1 & 8");
					}
				}
				System.out.print(SequenceFinder.arrange(operation, set, nums));
			}
			else {
				throw new IllegalArgumentException("Operation values must be in between 1 & 50, Set value between 1 & 10^9");
			}
		}
		catch(NumberFormatException ex) {
			System.out.println("Allow only numbers with single space delimited!");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Should input 2 numbers with single space delimited!");
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
