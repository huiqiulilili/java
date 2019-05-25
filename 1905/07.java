import java.util.Arrays;
public class Main{
	public static void bubbleSort(int[] array){
	
		for(int i = 0;i < array.length;i ++){
			for(int j = 0;j < array.length - i - 1;j ++)
			if(array[j] > array[j + 1]){
				int c = array[j];
				array[j] = array[j + 1];
				array[j + 1] = c;
			}
			
		}
	}
	public static int binarySearch(int[] array,int key){
		int left = 0;
		int right = array.length;
		//[3,4)  无值了
		while(left < right){
			int mid = (left - right) / 2 + right;
			if(array[mid] == key){
				return mid;
			}
			if(array[mid] < key){
				left = mid + 1;
			}
			if(array[mid] > key){
				right = mid;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] randomArray = new int[]{ 1,2,3,4,5};
		System.out.println(Arrays.toString(randomArray));
		System.out.println(binarySearch(randomArray,3));	
	}
}
