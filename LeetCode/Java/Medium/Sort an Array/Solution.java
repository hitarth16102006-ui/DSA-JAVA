class Solution {
    public int[] sortArray(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int l = i;
            int r = i + 1;

            while (r < n) {

                if (arr[l] > arr[r]) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                }

                r++;
            }
        }

        return arr;
    }
}