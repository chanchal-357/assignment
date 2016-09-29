package com.chanchal.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceFinder {

	public static String arrange(int operation, long set, int[][] nums) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		for (long j = 0; j < set; j++) {
			for (int i = 0; i < nums.length; i++) {
				int k = 0;
				Collections.swap(list, nums[i][k++]-1, nums[i][k++]-1);
			}
		}
		String output = "";
		for(Integer lst : list) {
			output += lst + " ";
		}
		return output.trim()+"\n";
	}
}
