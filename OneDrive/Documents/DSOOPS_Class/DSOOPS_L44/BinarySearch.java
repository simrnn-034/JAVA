import java.util.*;

public class BinarySearch {
    static int binarySearch(int[] arr, int l, int r, int key) {
        if (l > r){ return -1;
        }
        int mid = (l + r) / 2;
        if (arr[mid] == key){ 
            return mid;
        }
        if (arr[mid] > key) {
            return binarySearch(arr, l, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, r, key);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int key = in.nextInt();
        int res = binarySearch(arr, 0, n - 1, key);
        System.out.println(res);
        in.close();
    }
    
}
