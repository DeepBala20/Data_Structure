 public class CircularLinkList{
 	public static void main(String[] args) {
 		CirLinkList c1 = new CirLinkList();
 		c1.insertFront(10);
 		c1.insertFront(20);
 		c1.insertFront(30);
 		c1.insertFront(40);
 		System.out.println();
 		c1.display();
 		c1.delete(40);
 		System.out.println();
 		c1.display();
 	}
 }


 class Node{
 	int data;
 	Node next;

 	Node(int x){
 		this.data = x;
 	}
 }

 class CirLinkList{
 	Node head;

 	void insertFront(int y){
 		Node n = new Node(y);
 		if(head == null){
 			head = n;
 			head.next = head;
 		}
 		else{
 			Node temp = head;
 			while(temp.next != head){
 				temp = temp.next;
 			}
 			n.next = head;
 			temp.next = n;
 			head = n;
 		}
 	}
 	void insertEnd(int y){
 		Node n = new Node(y);
 		if(head == null){
 			head = n;
 			head.next = head;
 		}
 		else{
 			Node temp = head;
 			while(temp.next != head){
 				temp = temp.next;
 			}
 			n.next = head;
 			temp.next = n;
 		}
 	}
 	void delete(int data){
 		Node temp = head;
 		if(temp == null ){
 			System.out.println("Empty!");
 		}
 		Node pred = null;
 		if(head.data == data){
 			System.out.println(head.data);
 				head = head.next;
 				Node temp1 = head;
					while(temp1.next.next != head){
						temp1 = temp1.next;
					}
					temp1.next = head;

 		}else{
 		while(temp.next != head ){

 			if(temp.next.data == data){
 				temp.next = temp.next.next;
 				break;
 			}
 			else{

 			temp = temp.next;
 			}
 		}
 		}
 	}

 	void display(){
		Node temp = head;
		while(temp.next != head ){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

 }