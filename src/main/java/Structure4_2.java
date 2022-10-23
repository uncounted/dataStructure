public class Structure4_2 {
    // 버블 정렬
    public static int[] bubbleSort(int[] list) {
        int unsortedUntilIndex = list.length - 1;
        boolean sorted = false;
        int temp = 0;

        while (!sorted) {
            sorted = true;
            for (int i=0; i < unsortedUntilIndex; i++) {
                if (list[i] > list[i+1]) {
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    sorted = false;
                }
            }
            unsortedUntilIndex -= 1;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] list = {1, 5, 2, 7, 4, 8, 3, 9};
        bubbleSort(list);
    }
}
