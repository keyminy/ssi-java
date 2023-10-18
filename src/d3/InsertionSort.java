package d3;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {9,1,8,2,7,3,6,4,5};
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j = i; j > 0; j--) {
//				System.out.printf("[%d] :: [%d]\n",i,j-1);
				if(arr[j-1] > arr[j]) {
//					System.out.println("======> change");
					//swap arr[j]를 swap,큰거 뒤로가게
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					//자기보다 작은 데이터를 만나면 그 위치에서 stop
				}else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
