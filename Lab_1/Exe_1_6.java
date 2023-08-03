import java.util.Scanner;
public class Exe_1_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num ");
		int x = sc.nextInt();
		System.out.println("Enter Power ");
		int y = sc.nextInt();
		Power p1 = new Power();
		p1.power(x,y);
	}
}


class Power{
	public void power(int x,int y){
		int ans =1;
		for(int i = 0;i<y;i++){ 
			ans= ans*x;
		}
		System.out.println("Power is : "+ans);
	}
}