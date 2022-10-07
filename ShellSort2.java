
public class ShellSort2 {

	public static void main(String[] args) {
		int a[]={755,604,126,342,747,102};
		int len = a.length;
		System.out.println("The Unsorted array is :-");
		for(int i=0;i<len;i++){
			System.out.print(a[i]+" ");
		}	
		for(int gap=len/2;gap>=1;gap=gap/2){
			for(int j=gap;j<len;j++){
				for(int i=j-gap;i>=0;i=i-gap){
					if(a[i]<a[i+gap]){
						break;
					}
					else
					{
					  int temp = a[i];
					  a[i]=a[i+gap];
					  a[i+gap]=temp;
					}
				}
			}
		}
		System.out.println();
		System.out.println("The sorted array is :- ");
		for(int i=0;i<len;i++){
			System.out.print(a[i]+" ");
		}	
	}

}
