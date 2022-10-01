package lab11;

import java.util.Stack;

public class Stack1 {
    public static void display(Stack s){
        if (s.isEmpty()){
            return;
        }
        else {
            int x= (int) s.peek();
            s.pop();
            System.out.print(x+" ");
            display(s);
            s.push(x);
        }
    }
    public static void insert_bottom(int x,Stack s){
        if (s.isEmpty()){
            s.push(x);
            return;
        }
        int temp= (int) s.peek();
        s.pop();
        insert_bottom(x,s);
        s.push(temp);
    }
    public static void reverse(Stack s){
        if (s.isEmpty()){
            return;
        }
        int x= (int) s.peek();
        s.pop();
        reverse(s);
        Stack s1 = new Stack();
       insert_bottom(x,s);


    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("original stack");
        display(s);
        System.out.println();
        System.out.println("reversed stack");
        reverse(s);
        display(s);

    }
}
