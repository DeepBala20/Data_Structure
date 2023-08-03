import java.util.Scanner;
public class Exe_1_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		EvenOdd e1 = new EvenOdd();
		e1.evenOrOdd(x);
	}
}

class EvenOdd{
	public void evenOrOdd(int x){
		if (x % 2 == 0){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is Odd");	
		}
	}
}