class Node{
	int val;
	Node next;
}
public class Pink{
	public Node partition(Node head,int x){
		
	Node small = null;
	Node big = null;
	
	Node last1 = null;
	Node last2 = null;
	
	for(Node cur = head;cur != null;cur = cur.next){
		if(cur.val < x){
			if(small == null){
				//头插
				small = cur;
			}else{
				//尾插
				last1.next = cur;
			}
			last1 = cur;
		}else{
			//尾插到big上
			if(big == null){
				//头插
				big = cur;
			}else{
				//尾插
				last2.next = cur;
			}
			last2 = cur;
		}
	}
	//拼接big small
	if(last1 == null){
		return big;
	}else{
	   last1.next = big;
	    }
	
}
