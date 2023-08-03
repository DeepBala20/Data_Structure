import java.util.Scanner;

public class Exe_3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int arr[] = new int [n+1];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element you want to place :");
        int x = sc.nextInt();
        int index =n;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                index = i;
                break;
            }
            
        }
        func(arr,x,index,n);
        
    }
    static void func(int arr[],int x ,int index,int n){
        int temp=0;
        // int n = arr.length;
        for(int i=index;i<n+1;i++){
            temp = arr[i];
            arr[i] = x;
            x = temp;
        }

        for(int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}