import java.util.Scanner;
import java.util.Stack;
public class IntoPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter infix String");
        String input = sc.next();
        char c,x;
        String hendler="",output="",prefix="";
        Stack<Character> s1 = new Stack<>();
        Check c1 = new Check();

        for (int i =input.length()-1 ; i>=0;i--){
            c = input.charAt(i);
            if(c == '('){
                c = ')';
            }
            else if (c == ')'){
                c = '(';
            }
            hendler = hendler+c;
        }
        for(int j=0;j<hendler.length();j++){
            x = hendler.charAt(j);
            if(x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z' ){
                output = output+ x;
            }            
            else if(x == '('){
                s1.push(x);
            }
            else if(x == ')'){
                while(!s1.empty() && s1.peek()!= '('){
                    output = output+s1.pop();
                }
                if(!s1.empty() && s1.peek() == '('){
                    s1.pop();
                }
            }
            else{
                while(!s1.empty() && c1.checkPresidence(x)<= c1.checkPresidence(s1.peek())){
                    output = output+s1.pop();
                }
                s1.push(x);
            }
        }
        while(!s1.empty()){
                output = output+s1.pop();
        }
        for(int k = output.length()-1;k>=0;k--){
                prefix = prefix+output.charAt(k);
        }
        System.out.println(prefix);
    }
}

class Check{
    int checkPresidence(char x){
        switch (x){
            case '+' : 
            case '-' :return 1;
            case '*' :
            case '/' :return 2;
            case '$' :
            case '^' :return 3;
            default : return -1;
        }
    }
}