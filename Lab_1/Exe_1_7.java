import java.util.Scanner;
public class Exe_1_7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int x = sc.nextInt();
		Factor f1= new Factor();
		f1.factor(x); 
	}
}

class Factor{
	public void factor(int x){
		System.out.println("Factors are : ");
		for(int i = 1;i<=x ;i++){
			if(x%i==0){
				System.out.println(i+"\n");
			}
		}
	}
}