package sort;

public class SelectionSort {
	
	/* 선택 정렬
	 * 
	 * 오름차순으로 정렬한다.
	 * O(n^2)의 복잡도
	 * */
	
	public static void main(String args[]) {

		int i, j, min, temp, index = 0;

		int array[] = { 1, 10, 5, 3, 7, 2, 6, 8, 4, 9 };

		for (i = 0; i < array.length; i++) {

			min = 999;

			for (j = i; j < array.length; j++) {

				if (min > array[j]) {
					
					min = array[j];
					index = j;
				}
			}

			temp = array[i];
			array[i] = array[index];
			array[index] = temp;

		}
		for (i = 0; i < array.length; i++) {
			
			System.out.print(" "+array[i]);
		}

	}
}
