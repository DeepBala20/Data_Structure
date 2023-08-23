import java.util.*;
public class Evaluate_Postfix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		Postfix p1 = new Postfix(str);
		System.out.println(p1.eval());
	}
}

class Postfix{
	String postfix;
	Postfix(String str){
		this.postfix = str;
	}

	double eval(){
		Stack<Character> s1 = getStack(postfix);//reverse post fix from temp
		Stack<Double> num = new Stack<>();
		while(!s1.empty()){
			if(Character.isDigit(s1.peek())){
				num.push(Double.parseDouble(String.valueOf(s1.pop())));
			}
			else{
				double oprand2 = num.pop();
				double oprand1 = num.pop();
				char operator = s1.pop();
				num.push(getAns(oprand1,operator,oprand2));
			}
		}
		if(num.size() == 1){
			return num.pop();
		}
		else{
			return 0;
		}
	}

	double getAns(double x,char y,double z){
		switch (y){
			case '+' : return x + z;
			case '-' : return x - z;
			case '*' : return x * z;
			case '/' : return x / z;
			case '^' : 
			case '$' : return Math.pow(x,z);
			default : return 0;
		}
	}

	Stack<Character> getStack(String str){
		Stack<Character> temp = new Stack<>();
		for (int i = str.length()-1 ; i>=0 ; i--){
			temp.push(str.charAt(i));

		}
		return temp;
	}
	
}