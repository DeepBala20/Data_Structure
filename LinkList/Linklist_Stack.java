import java.util.Scanner;
public class Linklist_Stack{
    public static void main(String[] args) {
        Link_List l1 = new Link_List();
        Scanner sc = new Scanner(System.in);
        

        while(true){
            System.out.println("Enter choice \n{1.for push}\n{2.for pop}\n{3.for print}\n{4.for exit}");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:System.out.println("Enter Value for insert");
                        int x = sc.nextInt();
                        l1.push(x);
                    break;
                case 2 : l1.pop();
                    break;
                case 3 :System.out.println("Elements of Stack:"); 
                        l1.print();
                    break;
                case 4 : return;   
            }
        }
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
    Node top;
    void push (int y){
        Node n = new Node(y);
        if (top == null){
            top = n;
        }
        else{
            n.next = top;
            top = n;
        }

    }
    void pop(){
        if(top == null){
            System.out.println("Stack is Empty !");
        }
        else{
            System.out.println(top.data+"is Deleted");
            top = top.next;
        }
        }
    void print(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}