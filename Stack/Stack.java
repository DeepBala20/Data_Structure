import java.util.*;
public class Stack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of stack:");
        int n = sc.nextInt();
        StackHandle s1 = new StackHandle(n); 

        int choice;

        while(true){
            System.out.println("Enter choice \n {1 for push}\n{2 for pop}\n{3 for display}\n{4 for peek}\n{5 for exit}");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("enter element");
                        int element = sc.nextInt();
                        s1.push(element);
                    break;
                
                case 2: System.out.println("delete element is :"+s1.pop());
                        break;
                
                case 3: s1.display();
                        break;
                
                case 4: System.out.println("peeked element is:"+s1.peek());
                        break;
                case 5: return;        

            }
        }
    }
}

class StackHandle{
    int top;
    int arrStack[] ;
    int n;

    StackHandle(int n){
        this.n = n;
        arrStack = new int[n];
        top = -1;
    }

    void push(int x){
        if(top >= n-1 ){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arrStack[top] = x;
        }
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int y = arrStack[top];
            top -- ;
            return y;
        }
    }

    void display(){
        System.out.println(" Elements of Stack:");
        for(int i = 0; i<= top ; i++){
            System.out.println(arrStack[i]);
        }
    }

    int peek(){
        return arrStack[top];
    }
}