package lab11;

public class Lowercase_letters {
    public static void lower_case(String s,int n){
        if (s.charAt(n)>= 97 && s.charAt(n)<=122){
            System.out.println("lower case letter = "+s.charAt(n));
            return;
        }
        lower_case(s,n-1);
    }
    public static void main(String[] args) {
        String s = "HELlO";
        int n = s.length();
        System.out.println(" string = "+s);
        lower_case(s,n-1);
    }
}
