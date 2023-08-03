import java.util.Scanner;
public class Exe_1_8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int x = sc.nextInt();
		Prime f1= new Prime();
		f1.isprime(x); 
	}
}

class Prime{
	public void isprime(int x){
		int count=0;
		for(int i = 2;i<=x/2 ;i++){
			if(x%i==0){
				System.out.println("num is not Prime");
				count++;
				break;
			}
			
		}
		if(count==0){		
			System.out.println("num is Prime");
		}
	}
}