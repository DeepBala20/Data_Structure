import java.util.Scanner;
public class Exe_2_13{
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
		for (int i=0;i<a.length ;i++ ) {
			for (int j=(i+1);j<a.length ;j++ ) {
				if(a[i] == a[j]){
					System.out.println("Duplicate find at "+i);
				}
			}
		}
	}
}