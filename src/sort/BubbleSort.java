package sort;

public class BubbleSort {
	/* 버블정렬
	 * 
	 * 오름차순으로 정렬한다.
	 * 옆의 숫자와 비교해서 작은 숫자를 앞으로 보낸다.
	 * O(n^2)의 복잡도
	 * */
	public static void main(String args[]) {
		
		int i, j, temp;
		
		int array[] = { 1, 10, 5, 3, 7, 2, 6, 8, 4, 9 };
		
		for(i=0; i<array.length; i++) {
			
			for(j=0; j<array.length-1; j++) {
				
				if(array[j]>array[j+1]) {
					
					temp=array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(i=0; i<array.length; i++) {
			System.out.print(" "+array[i]);
		}
		
	}
	
	
	
}
