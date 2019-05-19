import java.util.Arrays;
class Group{
		String name;
		int personSum;
		Group(String n,int i){
			name = n;
			personSum = i;
		}
		void print(String welcom){
			System.out.printf("%s %s的 位 同学%d",welcom,name,personSum);
		}
	}
class B{
		int sum;
		
		B(int a,int b,int c){
			System.out.println(a + b + c);
			sum = a + b + c;
	}

		
		void print(){
			System.out.println(sum);
		}
	}
public class Main{
	//二分查找 左闭右开
	public static int binarySearch(int[] array,int key){
		int left = 0;
		int right = array.length;
		while(left < right){
		int mid = (left - right) / 2 + right;
		if(array[mid] < key){
			left = mid + 1;
		}
		if(array[mid] > key){
			right = mid;
		}
		if(array[mid] == key){
			return mid;
		}
	}
	return -1;
	}
	//二分查找 左闭右闭
	public static int binarySearch1(int[] array,int key){
		int left = 0;
		int right = array.length - 1;
		while(left <= right){
		int mid = (left - right) / 2 + right;
		if(array[mid] < key){
			left = mid + 1;
		}
		if(array[mid] > key){
			right = mid - 1;
		}
		if(array[mid] == key){
			return mid;
		}
		}
		return -1;
	}
	//冒泡
	public static int[] maopao(int[] array){
		int n = array.length;
		for(int i = 0;i < n;i ++){
			for(int j = 0;j < n - i - 1;j ++){
				if(array[j] > array[j + 1]){
					int c=0;
					c = array[j];
					array[j] = array[j + 1];
					array[j + 1] = c;
				}
			}
		}
		return array;
	}
	public static void testPrint(){
		System.out.println();
		System.out.print("我是中国人");//不换行
		System.out.println("haha" + 1);//换行
		//System.out.printf("");//代参
		//System.out.format("");//带参
	}
	
	public static void main(String[] args){
		//int n = binarySearch(new int[]{1,2,3,4,5},0);
		//System.out.println("下标为"+n);
		//int array1[] = new int[]{2,7,5,1};
		//maopao(array1);
		//System.out.println(Arrays.toString(array1));
		//Group group = new Group("java10班",50);
		//group.print("欢迎");
		B cc = new B(1,2,3);
		cc.print();
}
}

