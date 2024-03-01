package linkedList;

class MyHashSet {
    private int length = 0;
    private int[] arr = new int[length];

    public MyHashSet() {

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
