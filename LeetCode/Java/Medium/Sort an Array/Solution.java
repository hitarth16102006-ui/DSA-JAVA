class Solution {
    public int[] sortArray(int[] arr) {

        int n = arr.length;

       

            int l = 0;
            int r = n-1;

            while (r < n) {

                if (arr[l] > arr[r]) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                }

                r++;
            }
        

        return arr;
    }
}