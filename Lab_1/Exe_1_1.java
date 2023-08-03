import java.util.Scanner;
public class Exe_1_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of the Circle");
		double r = sc.nextDouble();
		Area a1 = new Area();
		a1.area(r);
	}
}

class Area{
	public void area(double x){
		double carea = Math.PI*x*x;
		System.out.println("Area of Circle is :"+carea);
	}
}