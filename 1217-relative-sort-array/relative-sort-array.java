class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int left = 0;
        int right = arr1.length - 1;
        int i = 0;

        Arrays.sort(arr1);

        while (i < arr2.length) {

            int j = left;

            while (j <= right) {

                if (arr1[j] == arr2[i]) {

                    int temp = arr1[left];
                    arr1[left] = arr1[j];
                    arr1[j] = temp;

                    left++;
                }

                j++;
            }

            i++;
        }

        
        Arrays.sort(arr1, left, arr1.length);

        return arr1;
    }
}