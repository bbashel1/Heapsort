import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HeapDriver {
	public static void main(String[] args){
		Long startTime = System.currentTimeMillis();
		int[]arr = new int[1000000];

		try {
			Scanner scan = new Scanner( new File("input_1000000.txt"));
			int n = 0;
			while(scan.hasNext()){
				arr[n++] = scan.nextInt();
			}
			scan.close();
			HeapSort.heap(arr);
			//System.out.println(Arrays.toString(arr));
			long endTime = System.currentTimeMillis();
			System.out.println("Actual taken time " + (endTime - startTime) + " Milliseconds");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}

}
