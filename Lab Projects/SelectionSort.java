package labprojects;

public class SelectionSort {
	//here we will try to sort the values within the integer array below with a method we code called selection:
		public static void main(String[] args){
			int [] a = {9,3,17,2,8,12,6,4};
			for (int i = 0; i<a.length; i++){
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			sort(a);
			for (int i = 0; i<a.length; i++){
				System.out.print(a[i] + " ");
			}
		}
		
		public static void sort(int [] x){
			for (int i = 0; i<x.length; i++){
				int min = x[i];
				int minIndex = i;
				for (int j=i+1; j<x.length; j++){
					if (x[j]<min){
						min = x[j];
						minIndex = j;
					} //if
				} //for j
				int temp = x[i];
				x[i] = min;
				x[minIndex] = temp;
			} //for i
		}
		
}
