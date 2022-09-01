//Detect the largest element in the list
//Select it and send to last position
public class SelectionSort {
	public static void swaps(int a[], int i, int j) {
		int temp= a[i];
		
		a[i]=a[j];
		a[j]=temp;
	}

	public static void main(String[] args) {
		int b[]= {5,4,3,2,1};
		System.out.println("The Given Array is :- ");
		for (int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		for(int lui=b.length-1;lui>0;lui--) {
			int largest = 0;
			for(int i=1;i<=lui;i++) {
				if(b[i]>b[largest]) {
					largest=i;
				}
				}
			swaps(b,largest,lui);
			}
		System.out.println();
		System.out.println("The sorted array is :- ");
		for (int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}

	}

}
