package programs;

import java.util.LinkedList;
//Write logic when next visit
class LinkedLists<I extends Integer> extends LinkedList{
      int val;
      LinkedLists<Integer> next;
      LinkedLists() {}
      LinkedLists(int val) { this.val = val; }
      LinkedLists(int val, LinkedLists<Integer> next) { this.val = val; this.next = next; }
}

public class Merge2SortedLinkedLists {

    public static void main(String[] args){
        LinkedLists<Integer> list1 = new LinkedLists<>(1);
        LinkedLists<Integer> list2 = new LinkedLists<>(2);
        list1.next = new LinkedLists<>(3);
        list2.next = new LinkedLists<>(4);

        LinkedLists<Integer> result = mergeLists(list1, list2);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    //1, 3
    //2, 4
    private static LinkedLists<Integer> mergeLists(LinkedLists list1, LinkedLists list2) {
        if(list1 != null && list2 != null){
            if(list1.val < list2.val){
                list1.next = mergeLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next = mergeLists(list1, list2.next);
                return list2;
            }
        }


        if(list1 == null)
            return list2;
        return list1;
    }


}
