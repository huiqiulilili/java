import java.util.Arrays;

abstract class List{
    private int size;

    List(){
        size = 0;
    }

    public void pushFront(int val){
        insertInternal(0,val);
        incSize();
    }

    public void pushBack(int val){
        insertInternal(size,val);
        incSize();

    }

    public void insert(int index,int val){
        if(index < 0 || index > size){
            System.out.println("index越界");
        }
        insertInternal(index,val);
        incSize();
    }

    protected abstract void insertInternal(int index,int val);

    protected void incSize(){
        size++;
    }

    public int getSize(){
        return size;
    }

    abstract public void display();
}

class ArrayList extends List{

    public void insertInternal(int index,int val){
            array[index] = val;
    }
    private int[] array;

    ArrayList(){
        super();
        array = new int[10];
    }

    public void display(){
        for(int i = 0;i < getSize();i++){
            System.out.println(array[i]);
        }
    }
    private void ensureCapacity(){
        if(getSize() < array.length){
            return;
        }
        array = Arrays.copyOf(array,array.length * 2);
    }
}
class Node{
    int val;
    Node next = null;

    Node(int val){
        this.val = val;
    }

    Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}

class LinkedList extends List{
    private Node head = null;

    public void insertInternal(int index,int val){
        if(index == 0){
            head = new Node(val,head);
        }else {
            Node prev = head;
            for(int i = 0;i < index - 1;i ++){
                prev = prev.next;
            }

            prev.next = new Node(val,prev.next);
        }
        incSize();
    }

    public void display(){
        for(Node cur = head;cur != null;cur = cur.next){
            System.out.println(cur.val);
        }
    }
}
public class Practice {
    static void testList(List list){
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        list.insert(3, 100);

        list.display();
    }

    public static void main(String[] args) {
        testList(new ArrayList());
        testList(new LinkedList());
    }
}
