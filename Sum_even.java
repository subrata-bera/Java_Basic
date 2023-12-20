import java.util.*;

class Sum_even {
    public void even(int no) {
        int rem, sum = 0, temp;
        temp = no;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;

            if (rem % 2 == 0)
                sum = sum + rem;
        }

        System.out.println("Sum of all even digit is " + sum);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of all even digits");
        int n = sc.nextInt();
        Sum_even r = new Sum_even();
        r.even(n);
    }
}