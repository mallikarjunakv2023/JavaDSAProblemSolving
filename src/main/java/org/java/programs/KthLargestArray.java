package org.java.programs;
import java.util.*;
public class KthLargestArray {
    public static void main(String[] args){
        int[] array = {9, 4, 6, 8, 3, 7, 2};
        int k = 2;
        System.out.println(findKthSmallest(array, k));
    }

    private static int findKthSmallest(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < k; i++){
            heap.offer(nums[i]);
        }
        System.out.println(heap);

        for (int i = k; i < nums.length; i++){
            heap.offer(nums[i]);
            System.out.println(heap);
            if(heap.size() >k){
                heap.poll();
            }
        }

        return heap.peek();
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}
