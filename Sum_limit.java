import java.util.*;

class Sum_limit {
    public void limit(int lb, int ub) {
        int sum = 0;
        while (lb <= ub) {
            sum = sum + lb;
            lb = lb + 1;

        }

        System.out.println("Sum of all even number of " + lb + " to " + ub + " is " + sum);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter uppur and lower bound ");
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        Sum_limit r = new Sum_limit();
        r.limit(upper, lower);

    }

}
