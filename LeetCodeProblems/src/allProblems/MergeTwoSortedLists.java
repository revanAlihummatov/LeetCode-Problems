package allProblems;

import java.util.Arrays;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        //System.out.println("In ListNode :" + InListNode.mergeTwoLists(new ListNode(){1,2,4}, new ListNode(){1,3,4}));
        System.out.println("In Array :" + Arrays.toString(InArray.mergeTwoLists(
                new int[]{}, new int[]{0}))
        );
    }
}

class InArray {
    public static int[] mergeTwoLists(int[] arr1, int[] arr2) {
        int[] arr12 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr12[i] = arr1[i];
        }
        int z = 0;
        for (int i = arr1.length; i < arr12.length; i++) {
            arr12[i] = arr2[z];
            z++;
        }
        bubbleSort(arr12);
        return arr12;
    }
    public static void bubbleSort(int[] arr) {
        int val;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    val = arr[j];
                    arr[j] = arr[i];
                    arr[i] = val;
                }
            }
        }
    }
}

class InListNode {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(-1);
        ListNode val = listNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                val.next = list1;
                list1 = list1.next;
            } else {
                val.next = list2;
                list2 = list2.next;
            }
            val = val.next;
        }

        val.next = list1 == null ? list2 : list1;
        return listNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
