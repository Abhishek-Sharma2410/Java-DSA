import java.util.Stack;
public class CreationJCF{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println();
    }
}