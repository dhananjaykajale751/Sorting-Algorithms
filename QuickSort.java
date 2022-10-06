import java.util.*;
import java.io.*;
public class QuickSort {
	public static void swap(int i, int j) {
		int temp =i;
		 i=j;
		 j=temp;
			}
	public static int partition(int arr[],int start, int end) {
		int pivot=arr[start];
		int count =0;
		for (int i=start+1;i<=end;i++) {
			if (arr[i]<=pivot) {
				count++;
				
			}
			
		}
		int pivotIndex=start+count;
		 int temp = pivot;
	        arr[start] = arr[pivotIndex];
	        arr[pivotIndex] = temp;
		int i=start;
		int j= end;
		while(i<pivotIndex && j>pivotIndex) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<pivotIndex && j>pivotIndex) {
				swap(arr[i++], arr[j--]);
			}
		}
		
		return pivotIndex;
	}
	public static void quicksort(int arr[],int start, int end) {
		if(start>=end) {
			return;
		}
		
		int p=partition(arr,start,end);
		quicksort(arr, start, p-1);
		quicksort(arr, p+1, end);
		
	}
	
	public static void main(String[] args) {
		int []a= {5,4,3,2,1};
		quicksort(a, 0, a.length-1);
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}

}
