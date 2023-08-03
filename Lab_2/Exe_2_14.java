import java.util.Scanner;
public class Exe_2_14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		

		for(int i=0;i<n;i++){
			System.out.println("Enter Element ");
			a[i]=sc.nextInt();
		}
		Duplicate a1 = new Duplicate();
		a1.dupl(a);
	}
}

class Duplicate{
	public void dupl(int[] a){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st num which is find ");
		int x = scn.nextInt();
		System.out.println("Enter 2nd num which is replace ");
		int y = scn.nextInt(); 

		System.out.println("Old array is:");
		for(int i=0;i<a.length;i++){
			System.out.println("Element of array is :"+a[i]);
			
		}

		for (int i=0;i<a.length ;i++ ) {
			if(x==a[i]){
				a[i] = y;
				System.out.println("1st num is find at index:"+i);
			}
		}

		System.out.println("New array is:");
		for(int i=0;i<a.length;i++){
			System.out.println("Element of array is :"+a[i]);
			
		}
	}
}