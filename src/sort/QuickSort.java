package sort;

public class QuickSort {
	/*
	 * 퀵 정렬
	 * 
	 * 오름차순으로 정렬한다. 하나의 정렬을 두개의 정렬로 분할하여 검색 기준값(=피벗)을 이용한다.
	 * 보통 정렬의 첫번째 값을 피벗으로 사용한다.
	 * O(n * log(n))의 복잡도. 최악의 경우 O(n^2)
	 */
	public void sort(int[] data, int l, int r){
     
        //원소가 하나인 경우,
        if (l == r)return; 
        
        int left = l;
        int right = r;
        int pivot = data[l];
        
        do{//left와 right가 만날 때 까지

        	//피벗 값보다 작은값을 만날 때 까지 left는 이동한다.
            while(data[left] < pivot) {
            	left ++;
            }
            //피벗 값보다 큰값을 만날 때 까지 right는 이동한다.
            while(data[right] > pivot) {
            	right --;
            }
            
            if(left <= right){ //만났다면 left값과 right값을 바꾸어준다.    
                
            	int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        //더 탐색할 것이 남았는지 확인
        if(l < right) { 
        	sort(data, l, right);
        }
        
        if(r > left) sort(data, left, r);
    }
    
    public static void main(String[] args) {
        
    	int array[] = { 1, 10, 5, 3, 7, 2, 6, 8, 4, 9 };
//		int array[] = {2};
//		int array[] = {10,8,9,10};
        QuickSort quick = new QuickSort();
        quick.sort(array, 0, array.length - 1);
        for(int i=0; i<array.length; i++){
            System.out.print(" "+array[i]);
        }
    }

	
}
