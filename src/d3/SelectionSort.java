package d3;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {9,1,8,2,7,3,6,4,5};
		
		for(int i=0; i<arr.length; i++) {
			int minIdx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}
		for(int num : arr) {
			System.out.print(num + ", ");
		}
	}
}
