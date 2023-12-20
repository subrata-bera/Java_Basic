import java.util.*;

class A {
    public int reverse(int no) {
        int rem, temp, rev = 0;
        temp = no;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println("Reverse of " + no + " is " + rev);
        return rev;
    }
}

class B extends A {
    public void palin(int rev, int no) {
        if (rev == no)
            System.out.println(no + " is a palindrome number");
            else
            System.out.println(no+" is not a Palindrom number");
    }
}

class Reverse_palindrom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        B r = new B();
        int rev = r.reverse(no);
        r.palin(rev, no);
    }
}
