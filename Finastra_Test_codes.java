package com.dsatest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	public static boolean containsNegativeNumber(int[] arr) {
		for (int num : arr) {
			if (num < 0) {
				return true; // Negative number found, return true
			}
		}
		return false; // No negative number found, return false
	}

	public int test_Fin(int[] A) {
		// first sort given array
		Arrays.sort(A);
		
		// edge condition : if all elements are -ve then directly return 1 as o/p
		if (containsNegativeNumber(A)) { return 1;}
		
		// Use HashSet to check if there is element present smaller than largest value in set
		Set<Integer> my_set =  new HashSet<>();
		for (int index : A) {
			my_set.add(index);
		}
		
		int last_value = A[A.length-1];
		if (my_set.contains(last_value-1)) {
			return last_value+1;
		}
		
		// else return smaller value than laregst_value
		else {
			return last_value-1;
		}
		
	}
}

public class Finastra_Test_codes {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = {1, 3, 6, 4, 1, 2}; //{ 1, 2, 3 }; //{ -1, -3 };  
		int result = solution.test_Fin(A);
		System.out.println("Final output is : "+result);

	}

}
