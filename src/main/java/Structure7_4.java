public class Structure7_4 {

    public static int largestProduct(int[] array) {
        int largestSoFar = array[0] * array[1] * array[2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array.length) {
            j = i + 1;
            while (j < array.length) {
                k = j + 1;
                while (k < array.length) {
                    if (array[i] * array[j] * array[k] > largestSoFar) {
                        largestSoFar = array[i] * array[j] * array[k];
                    }
                    k += 1;
                }
                j += 1;
            }
            i += 1;
        }

        return largestSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        largestProduct(arr);
    }
}


