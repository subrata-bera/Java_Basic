import java.util.*;

class Daytomonth {
    public void convert(int day) {
        int month, rday;
        month = day / 30;
        rday = day % 30;
        System.out.println(+day + " = " + month + " and " + day);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        int d = sc.nextInt();
        Daytomonth r = new Daytomonth();
        r.convert(d);
    }
}