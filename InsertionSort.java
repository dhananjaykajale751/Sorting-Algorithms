
public class InsertionSort {
//
	public static void main(String[] args) {
		int r[]= {22,-35,20,-15,56,-98};
		//fui = First Unsorted Index
		for(int fui=1;fui<r.length;fui++) {
			int i;
			int newElement=r[fui];
			for( i=fui;i>0 && r[i-1]>newElement;i--) {
				r[i]=r[i-1]; 
			}
			r[i]=newElement;
		}
		for(int a=0;a<r.length;a++) {
			System.out.println(r[a]);
		}

	}

}

