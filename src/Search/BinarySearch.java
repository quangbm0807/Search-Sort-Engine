package Search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        System.out.println("Array length is: "+arr.length);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Index: " + mid + " Value: " + arr[mid]);
            // Kiểm tra nếu key nằm giữa
            if (arr[mid] == key)
                return mid;
            // Nếu key lớn hơn, bỏ qua nửa bên trái
            if (arr[mid] < key)
                left = mid + 1;
                // Nếu key nhỏ hơn, bỏ qua nửa bên phải
            else
                right = mid - 1;
        }
        // Nếu không tìm thấy key
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 14, 15, 16, 17, 18, 19, 40, 60};
        int key = 60;
        int result = binarySearch(arr, key);
        if (result == -1)
            System.out.println("Phần tử không tồn tại");
        else
            System.out.println("Phần tử được tìm thấy tại chỉ số " + result);
    }
}
