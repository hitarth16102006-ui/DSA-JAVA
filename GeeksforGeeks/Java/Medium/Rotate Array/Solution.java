class Solution {
    public void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int i, int j) {
        int l = i;
        int r = j;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }
}