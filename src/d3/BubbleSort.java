package d3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {9,1,8,2,7,3,6,4,5};
		int cnt = 0;
		//9,8,7,6
		while (true) {
			boolean sw = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					// swap
					// arr[i]자리 값이 변경되어야함(큰거 뒤로)
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sw = true;
				}
			}
			if(!sw) {
				break;
			}
			cnt++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.printf("%d 번 수행 : ",cnt);
	}

}
