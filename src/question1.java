import java.util.Scanner;
public class question1 {
    public static String even_odd(int x) {
        if (x<0)
            return "invalid input";

        else if (x%2==0)
                return "even";
            else return "odd";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println( even_odd (x));
    }
}

