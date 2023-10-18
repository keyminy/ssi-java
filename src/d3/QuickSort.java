package d3;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		sort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}

		int pivot = start;
		int left = start + 1; // pivot보다 하나 큰 index
		int right = end;

		while (left <= right) {
			while (left <= end && arr[left] <= arr[pivot]) {
				left++;
			}

			while (right > start && arr[right] >= arr[pivot]) {
				right--;
			}
			// 엇갈렸으면..
			// 피벗 교체작업
			if (left > right) {
				int temp = arr[right]; // backup
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			} else {
				// 엇갈리지 않았으면, 데이터 교체 작업 필요하다 .
				// data교체작업
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}
			sort(arr, start, right - 1);
			sort(arr, right + 1, end);
		}
	}
}
