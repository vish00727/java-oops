public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merge = new int[len1 + len2];

        // Copy elements from arr1 to merge
        for (int i = 0; i < len1; i++) {
            merge[i] = arr1[i];
        }

        // Copy elements from arr2 to merge
        for (int i = 0; i < len2; i++) {
            merge[len1 + i] = arr2[i];
        }

        // Print the merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}

