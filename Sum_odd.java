import java.util.*;

class Sum_odd {
    public void odd(int no) {
        int rem, sum = 0, temp;
        temp = no;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;

            if (rem % 2 != 0)
                sum = sum + rem;
        }

        System.out.println("Sum of all odd digit is " + sum);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find trhe sum of all digits");
        int n = sc.nextInt();
        Sum_odd r = new Sum_odd();
        r.odd(n);
    }
}