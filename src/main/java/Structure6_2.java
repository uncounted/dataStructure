public class Structure6_2 {
    // 삽입 정렬
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int position = i - 1;

            while (position >=0 ) {
                if (array[position] > temp) {
                    array[position + 1] = array[position];
                    position = position - 1;
                } else {
                    break;
                }
            }

            array[position + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {8, 5, 3, 7, 0, 2, 1};
        insertionSort(array);
    }
}
