import java.util.Arrays;
public class Maina{
    private static int[] array;
    private static int size;	
	public Maina(){
		array = new int[11];
		size = 0;
	}
	public static void pushFront(int element){
		for(int i = size - 1;i >= 0;i --){
			array[i + 1] = array[i];
		}
		array[0]  = element;
		size++;
	}
	public static void pushBack(int element){
		array[size++] = element;
	}
	public static void insert(int element,int index){
		for(int i = size;i >= index+1;i --){
			array[i] = array[i - 1];
			array[index] = element;
			size++;
	}
	}
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	public static void main(String[] args){
		Maina main = new Maina();
		System.out.println(main.toString());
		pushBack(1);
		pushBack(2);
		pushBack(3);
		pushBack(4);
		pushBack(5);
		pushBack(6);
		pushBack(6);
		pushBack(4);
		pushBack(2);
		System.out.println(main.toString());
		
	}
}
