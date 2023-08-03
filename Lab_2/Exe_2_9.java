import java.util.Scanner;
public class Exe_2_9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		

		for(int i=0;i<n;i++){
			System.out.println("Enter Element ");
			a[i]=sc.nextInt();
		}
		Array a1 = new Array();
		a1.array(a);
	}
}

class Array{
	public void array(int [] a){
		
		
		for(int i=0;i<a.length;i++){
			System.out.println("Element of array is :"+a[i]);
			
		}
		
	}
}