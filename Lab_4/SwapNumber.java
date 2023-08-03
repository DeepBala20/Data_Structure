import java.util.Scanner;
public class SwapNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:-)");
        int a=sc.nextInt();
        System.out.print("Enter b:-)");
        int b=sc.nextInt();
        System.out.println("a="+a+"\n"+"b="+b);
        Swapping s1=new Swapping(a, b);
        System.out.println("=========After Swapping======");
        s1.swap(a,b);
        
    }
}
class Swapping{
    int a;
    int b;
    Swapping(int a,int b){
        this.a=a;
        this.b=b;
    }
    void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"\n"+"b="+b);
    }
}