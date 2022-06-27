package recussion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 0, arr.length, 1));
    }

    static int search(int[] arr, int start, int end, int target) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == target) {
            return mid;
        } else if(target > arr[mid]) {
            return search(arr, mid+1, end, target);
        } else {
            return  search(arr, start, mid-1, target);
        }
    }
}
