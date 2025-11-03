package com.github.rodiond26.stage_2.neetcode.binary_search;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];

        int first = 0;
        int second = 0;
        int index = 0;

        while (first < nums1.length && second < nums2.length) {
            if (nums1[first] < nums2[second]) {
                arr[index] = nums1[first];
                first++;
            } else {
                arr[index] = nums2[second];
                second++;
            }
            index++;
        }

        while (first < nums1.length) {
            arr[index] = nums1[first];
            first++;
            index++;
        }
        while (second < nums2.length) {
            arr[index] = nums2[second];
            second++;
            index++;
        }

        int mid = (nums1.length + nums2.length) / 2;
        if (arr.length % 2 == 1) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
    }
}
