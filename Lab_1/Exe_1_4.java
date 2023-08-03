import java.util.Scanner;
public class Exe_1_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int a = sc.nextInt();
		Factorial f1 = new Factorial();
		f1.factorial(a);
	}
}

class Factorial{
	public void factorial(int x){
		int fact=1;
		for(int i=1;i<=x;i++){
			fact=fact*i;
		}
		System.out.println("Factorial = "+fact);
	}
}