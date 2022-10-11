package com.nec.dsa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nec.excel.helper.ExcelHelper;

/**
 * Find a pair with the given sum in an array Given an unsorted integer array,
 * find a pair with the given sum in it. Input:
 * 
 * nums = [8, 7, 2, 5, 3, 1] target = 10
 * 
 * Output:
 * 
 * Pair found (8, 2) or Pair found (7, 3)
 * 
 * 
 * Input:
 * 
 * nums = [5, 2, 6, 8, 1, 9] target = 12
 * 
 * Output: Pair not found
 * 
 * @author shrey.singh
 *
 */
public class TwoSum {
	private static final Logger logger = LoggerFactory.getLogger(TwoSum.class);

	
	/*Using Brute-Force
	 * A naive solution is to consider every pair in the given array and return 
	 * if the desired sum is found.
	 * 
	 */
	
	// Naive method to find a pair in an array with a given sum
    public static void findPair(int[] nums, int target)
    {
        // consider each element except the last
        for (int i = 0; i < nums.length - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < nums.length; j++)
            {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target)
                {
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 18;
 
        findPair(nums, target);
    }
}

