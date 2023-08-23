public class Linklist_Queue{
    public static void main(String[] args) {
        Link_List l1 = new Link_List();
        l1.enqueue(5);
        l1.enqueue(15);
        l1.enqueue(25);
        l1.print();
        l1.dequeue();
        l1.print();


    }
}
class Node{
    int data ;
    Node next;
    Node(int x ){
        this.data = x;
    }
}

class Link_List{
    Node front;
    Node rear;
    void enqueue(int y){
        Node n = new Node(y);
        if(rear == null&&front == null){
            rear = n;
            front = n;
        }
        else{
            while(rear.next!= null){
                rear = rear.next;
            }
            rear.next = n;
        }
    }
    void dequeue(){
        front = front.next;
    }
    void print(){
        Node temp = front;
        while (temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}