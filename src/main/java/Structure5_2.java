public class Structure5_2 {
    // 선택 정렬
    public static int[] selectionSort(int[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] list = {5, 2, 8, 9, 6, 1, 3};
        selectionSort(list);
    }
}
