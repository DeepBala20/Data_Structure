import java.util.Scanner;
public class Exe_2_12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		

		for(int i=0;i<n;i++){
			System.out.println("Enter Element ");
			a[i]=sc.nextInt();
		}
		Finder a1 = new Finder();
		a1.find(a);
	}
}

class Finder{
	public void find(int[] a){
		int min = a[0];
		int position=0;
		for(int i = 0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
			if(min == a[i]){
				position = i;
			}
		}
		System.out.println("position is : "+position);

	}
}