package Search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("This is the times of loop " + i);
            if (arr[i] == key)
                System.out.println("Element found at index " + i);
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 1, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 20;
        int result = linearSearch(arr, key);
        if (result == -1)
            System.out.println("Phần tử không tồn tại");
        else
            System.out.println("Phần tử được tìm thấy tại chỉ số " + result);
    }
}
