import java.util.Scanner;
public class Exe_1_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char n = sc.next().charAt(0);
		CheckChar c1 = new CheckChar();
		c1.check(n);

	}
}

class CheckChar{
	public void check(char x){
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
			System.out.println("char is vowel ");
		}
		else{
			System.out.println("char is not vowel ");
		}
	}
}