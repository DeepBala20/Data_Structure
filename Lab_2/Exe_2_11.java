import java.util.Scanner;
public class Exe_2_11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Avg a1 = new Avg();
		a1.avg(n);
	}
}

class Avg{
	public void avg(int n){
		int total = 0;
		for(int i=1;i<=n;i++){
			total = total+i;
		}
		int avg=1;
		avg = total/n;
		System.out.println("Avg is:"+avg);
	}
}