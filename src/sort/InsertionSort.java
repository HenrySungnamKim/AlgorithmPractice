package sort;

public class InsertionSort {
    /* 삽입정렬
     *
     * 오름차순으로 정렬한다.
     * 필요할 때에만 삽입을 해서 정렬을 한다.
     * 데이터가 거의 정렬된 상태라면 가장 빠른 알고리즘
     * O(n) ~ O(n^2)의 복잡도
     * */

    public static void main(String args[]) {

        int i, j, temp;
        int array[] = {1, 10, 5, 3, 7, 2, 6, 8, 4, 9};
//		int array[] = {2};
//		int array[] = {10,8,9,10};

        for (i = 1; i < array.length; i++) {

            temp = array[i];

            for (j = i - 1; j >= 0; j--) {

                if (temp >= array[j]) {
                    break;
                }
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;

        }

        for (i = 0; i < array.length; i++) {

            System.out.print(" " + array[i]);
        }
    }
}
