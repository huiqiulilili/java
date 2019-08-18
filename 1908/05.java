class Node{
    int val;
    Node next = null;
    Node random = null;

    Node(int val){
        this.val = val;
    }

    Node(int val,Node random,Node next){
        this(val);
        this.random = random;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("Node(%d)",val);
    }
}
public class Practice3 {
    public static Node copy(Node head){
        if(head == null){
            return null;
        }

        Node cur = head;
        while (cur != null){
            //复制结点
            Node node = new Node(cur.val);

            //把新节点node插到cur后面
            node.next = cur.next;

            cur.next = node;
            //cur向后走一步
            cur = cur.next.next;
        }

        //复制random

         cur = head;

        while (cur != null){
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            }else{
                cur.next.random = null;
            }

            cur = cur.next.next;
        }

        //拆分新老链表

        cur = head;
        Node newHead = head.next;

        while (cur != null){
            Node node = cur.next;

            cur.next = node.next;
            if(cur.next != null) {
                node.next = cur.next.next;
            }else{
                node.next = null;
            }

            cur = cur.next;
        }
        return newHead;
    }

    private static Node test(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n1.random = n1;
        n2.random = n3;
        n3.random = n2;
        n4.random = n3;
        return n1;
    }

    public static void main(String[] args) {
        Node head = copy(test());
        for(Node cur = head;cur != null;cur = cur.next){
            System.out.println(cur);
        }
        System.out.println(head.next.random.val);
    }
}
