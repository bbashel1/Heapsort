import java.util.Arrays;


public class HeapSort {
	public static int heapSize;
	public static int left;
	public static int right;
	public static int max;
	public static int[] Arr;
	public static void heap(int[]b){
		System.out.println("Starting to search a " + b.length + "length array.");
		System.out.println(Arrays.toString(b));
		Arr = b;
		BUILDMAXHEAP(Arr);
		for(int i = Arr.length-1; i > 0; i--){
			swap(0, i);
			 heapSize = heapSize-1;
			MaxHeapify(Arr, 0);
		}
		System.out.println("Finished Sorting:" + Arrays.toString(Arr));
	
	}
	
	static void BUILDMAXHEAP(int[] Arr) {
		heapSize = Arr.length -1;
		for(int i= heapSize/2 ; i>= 0; i--){
			MaxHeapify(Arr,i);
		}
	}

	private static void swap( int i, int j) {
		int tmp = Arr[i];
		Arr[i] = Arr[j];
		Arr[j] = tmp;
	}
	private static void MaxHeapify(int[] Arr, int i) {
		left = 2*i;
		right = 2*i +1;
		if(left <= heapSize && Arr[left] > Arr[i] ){
			max  = left;
		}else{
			max = i;
		}
		if(right <= heapSize && Arr[right] > Arr[max]){
			max = right;
			
		}if(max != i){
			swap(i,max);
			MaxHeapify(Arr, max);
		}
		
		
	}
}
