import java.util.*;

class Palindrom {
    public void Palin(int no) {
        int temp, rem, rev = 0;
        temp = no;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        if (rev == no)
            System.out.println(+no + " is Palindrom number");
        else
            System.out.println(+no + " is not Palindrom");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrom or not");
        int n = sc.nextInt();
        Palindrom r = new Palindrom();
        r.Palin(n);

    }

}