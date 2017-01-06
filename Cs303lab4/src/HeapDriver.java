import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class HeapDriver {
	public static void main(String[] args){
		int[]arr = new int[10];

		try {
			Scanner scan = new Scanner( new File("input10.txt"));
			int n = 0;
			while(scan.hasNext()){
				arr[n++] = scan.nextInt();
			}
			scan.close();
			HeapSort.heap(arr);
			//System.out.println(Arrays.toString(arr));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}

}
