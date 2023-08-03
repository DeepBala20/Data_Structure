import java.util.*;
public class Exe_3_18{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element you want delete");
        int a = sc.nextInt();

        int temp=0;
        int index=0;
        for(int i=0;i<n-1;i++){
        	if(arr[i]==a){
        		index=i;
        		break;
        	}
        }
        for(int i=index;i<n-1;i++){
            temp = arr[i+1];
            arr[i] = temp;
        }

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
	}
}