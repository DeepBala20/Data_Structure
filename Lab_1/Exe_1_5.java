import java.util.Scanner;
public class Exe_1_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int x = sc.nextInt();
		Recursion r1 = new Recursion();
		int factorial = r1.fact(x);
		System.out.println("factorial = "+factorial);

	}
}

class Recursion{
	public int fact(int x){
		if(x==0){
			return 1;
		}
		else{
			int ans = fact(x-1)*x;
			return ans;
		}
	}
}