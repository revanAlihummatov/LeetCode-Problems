package linkedList;

import java.util.Arrays;

public class DesingHashMap {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        System.out.print("null  ");
        hashMap.put(1, 1);
        System.out.print("null  ");
        hashMap.put(2, 2);
        System.out.print("null  ");
        System.out.print(hashMap.get(1) + "     ");
        System.out.print(hashMap.get(3) + "     ");
        hashMap.put(2, 1);
        System.out.print("null    ");
        System.out.print(hashMap.get(2) + "     ");
        hashMap.remove(2);
        System.out.print("null    ");
        System.out.print(hashMap.get(2) + "     ");
    }
}

class MyHashMap {

    private int length = 0;
    private int[] arr = new int[length];

    public MyHashMap() {

    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void put(int key, int value) {
        if (key <= length) {
            arr[key - 1] = value;
        } else {
            int[] newArr = new int[key];
            System.arraycopy(arr, 0, newArr, 0, length);
            newArr[key - 1] = value;
            arr = newArr;
            length = key;
        }
    }

    public int get(int key) {
        if (length == 0){
            return -1;
        }for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return arr[i];
            }
        }
        return -1;
    }

    public void remove(int key) {
        if (length != 0){
            int[] newArr = new int[length - 1];

            for (int i = 0; i < length; i++) {
                if (arr[i] != key) {
                    if (i != 0) {
                        newArr[i - 1] = arr[i];
                    } else {
                        newArr[i] = arr[i];
                    }


                }
            }

            arr = newArr;
            length--;
        }

    }
}
