import java.util.Scanner;

//Bubble Sort Algorithm
//20 35 -15 7 55 1 -22 
// Consecutive Swapping 
// First step compare first no. and 2nd no.
//if first is greater then swap else don't swap
public class Bubble {
	public static void swap(int [] array, int i, int j) {
		if(i==j) {
			return;
		}
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Size Of Unsorted Array");
		int n = sc.nextInt();	
		int[] a= new int[n];
		System.out.println("enter the unsorted elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();	
			}
// LastUnsortedIndex=lui
		
		for(int lui= a.length-1;lui>0;lui--) {
			for(int i=0;i<lui;i++) {
				if(a[i]>a[i+1]) {
					swap(a,i,i+1);
				}
			}
		}
		System.out.println("The Sorted array is ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
	}

}
