public class Practice{
	int size;
	int[] array;
	public Practice(){
		size = 0;
		array = new int[11];
	}
	public void insert(int index, int element){
		if(index < 0 || index > size){
			System.out.println("下表错误！");
			return;
		}else{
			for(int i = size - 1; i >= index; i --){
				array[i + 1] = array[i];
			}
		}
		array[index] = element;
		size++;
	}
	public void erase(int index){
		if(index < 0 || index >= size){
			System.out.println("没有此下标！");
		}
		else{
			for(int i = index;i >= size - 1;i ++){
				array[i] = array[i + 1];
			}
		}
		size--;
		array[size] = 0;
	}
}  
