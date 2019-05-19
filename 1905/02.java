import java.util.Arrays;
public class a{
	public static int max(int[] array){
		int a = array[0];
		int c = 0;
		for(int item:array){
			c = a < item ? item: a; 
		}
			return c;
	}
	public static int indexOf(int[] array,int key){
		for(int i = 0;i < array.length;i ++ ){
			if(array[i] == key){
				return i;
			}
	} 
	return -1;
	}
	public static int min(int[] array){
		int a = array[0];
		int c = 0;
		for(int item:array){
			c = a > item ? item: a; 
		}
			return c;
	}
	public static double average(int[] scores){
		double average = 0.0;
		int sum = 0;
		int havemax = 0;
		int havemin = 0;
		int max = max(scores);
		int min = min(scores);
		for(int i = 0;i < scores.length;i ++){
			
			if((havemax == 0) && scores[i] == max){
				havemax++;
				continue;
			}
			if((havemin == 0) && scores[i] == min){
				havemin++;
				continue;
			}
				sum = sum + scores[i];
		}
		average = (sum) / (scores.length - havemax - havemin); 
		return average;
	}
	public static int[] copyOf(int[] src,int newLength){
		//newLength 可能大于 src.length
		//newLength 可能小于 src.length
		int[] array= new int[newLength];
		if(newLength > src.length){
			for(int i = 0;i < src.length;i ++){
				array[i] = src[i];
			}
			for(int i = src.length;i < newLength;i ++){
				array[i] = 0;
			}
		}else{
			for(int i = 0;i < newLength;i ++){
				array[i] = src[i];
			}
		}
		return array;
	}
	public	static void main(String[] args){
		//初始化数组
		int[] array = new int[]{1,2,3,4,5};
		int maxValue = max(array);
		System.out.println("最大值是"+maxValue);
		
		int index = indexOf(array,3);
		System.out.println("3的下标为"+index);
		double average = average(array);
		System.out.println("平均数为"+average);
		System.out.println(Arrays.toString(copyOf(array,6)));
		
	}
}
