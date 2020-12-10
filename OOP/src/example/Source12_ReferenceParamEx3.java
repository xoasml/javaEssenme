package example;

public class Source12_ReferenceParamEx3 {
	public static void main(String[] args) {
		int arr[] = new int[] {3, 2, 1, 6, 5, 4};
		
		printArr(arr);
		sortArr(arr);	//	정렬
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));	//총합
	}
	
	static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	static void sortArr(int[] arr) {
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int e=0; e<arr.length-i-1 ; e++) {
				int tmp = 0;
				if(arr[e] > arr[e+1]) {
					tmp = arr[e];
					arr[e] = arr[e+1];
					arr[e+1] = tmp;
				}
			}
		}
		
	}
	
}
