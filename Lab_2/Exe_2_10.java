import java.util.Scanner;
public class Exe_2_10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Sum s1 = new Sum();
		s1.sum(m,n);
	}
}

class Sum{
	public void sum(int m,int n){
		int total = 0;
		for(int i=m;i<=n;i++){
			total = total+i;
		}
		System.out.println("Sum of m to n is:"+total);
	}
}