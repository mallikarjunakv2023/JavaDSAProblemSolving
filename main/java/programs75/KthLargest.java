package programs75;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args){
        int[] arr = {4, 6, 3, 9, 0, 5, 1, 7};
        findKthLargestEle(arr, 4);
    }

    private static void findKthLargestEle(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int ele : arr){
            queue.add(ele);

            if(queue.size() > k)
                queue.poll();
            System.out.println(queue.toString());
        }

        System.out.println(queue.poll());
    }
}
