package lab11;

public class Count_strings {
    static int countSubstrings(String str, int i, int j, int n)
    {
        // base cases
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        int res =  countSubstrings(str, i + 1, j, n - 1) +
                countSubstrings(str, i, j - 1, n - 1) -
                countSubstrings(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;


    }

    public static void main(String[] args) {
        String str = "Sat";
        System.out.println("string = "+str);
        int n = str.length();
        System.out.println(countSubstrings(str, 0, n - 1, n));

        String str2 = "Satbharai";
        System.out.println("string = "+str2);
        int n2 = str2.length();
        System.out.println(countSubstrings(str2, 0, n2 - 1, n2));
    }
}

