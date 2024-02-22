package linkedList;

import java.util.Arrays;

public class DesingHashSet {
    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(2);
        System.out.println(mySet.contains(1));
        System.out.println(mySet.contains(3));
        mySet.add(2);
        System.out.println(mySet.contains(2));
        System.out.println(mySet);
        mySet.remove(2);
        System.out.println(mySet);
        System.out.println(mySet.contains(2));
    }
}

class MyHashSet {
    private int length = 0;
    private int[] arr = new int[length];

    public MyHashSet() {

    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void add(int key) {
        int[] newArr = new int[length + 1];
        System.arraycopy(arr, 0, newArr, 0, length);
        newArr[length] = key;
        arr = newArr;
        length++;
    }

    public void remove(int key) {
        int val = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                val++;
            }
        }

        if (val > 0) {
            int[] newArr = new int[length - val];
            int newIndex = 0;

            for (int i = 0; i < length; i++) {
                if (arr[i] != key) {
                    newArr[newIndex] = arr[i];
                    newIndex++;
                }
            }

            arr = newArr;
            length -= val;
        }
    }

    public boolean contains(int key) {
        for (int i = 0; i < this.length; i++) {
            if (arr[i] == key) {
                return true;
            }

        }
        return false;
    }
}
