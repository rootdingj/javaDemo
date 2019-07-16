package com.dj.exam.leetcode.ch01;

import java.util.Arrays;

public class Solution {

	public static int getSum(int a, int b) {
		int n;
		int m;
		// 没有进位的和
		n = a ^ b;
		// 进位
		m = (a & b) << 1;
		if (m == 0) {
			return n;
		} else {
			return getSum(n, m);
		}
	}

	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		int max_1 = Math.max(nums[0], nums[1]);
		int max_2 = nums[0];
		int max = max_1;
		int res = max;
		for (int i = 2; i < nums.length; i++) {
			max = max_2 + nums[i];
			max_2 = max_1;
			if (res < max)
				res = max;
			max_1 = res;
		}
		return res;
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] res = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				res[k] = nums1[i];
				i++;
				j++;
				k++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOfRange(res, 0, k);
	}

	public static void main(String[] args) {
//		System.out.println(getSum(1, 2));

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] results = intersect(nums1, nums2);
		for (int i : results) {
			System.out.println(i);
		}
	}

}
