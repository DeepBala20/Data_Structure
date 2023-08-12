import java.util.*;
public class IntoPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        char c = ' ';
        String out = "";
        Stack<Character> s1 = new Stack<>();
        Check c1 = new Check();
        
        for(int j=0 ; j<in.length() ;j++){
            c = in.charAt(j);
            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                out = out+c;
            }
            else if(c == '('){
                s1.push(c);
            }
            else if(c == ')'){
                while(!s1.empty() && s1.peek() != '('){
                    out = out + s1.pop();
                }
                if(!s1.empty() && s1.peek() == '('){
                    s1.pop();
                }
            }
            else{
                while(!s1.empty() && c1.checkPresidence(c)<= c1.checkPresidence(s1.peek())){
                    out = out+s1.pop();
                }
                s1.push(c);
            }
        }
        while(!s1.empty()){
            out = out+s1.pop();
        }
        System.out.println(out);
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