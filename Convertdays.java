//convert days to years months and days

import java.util.*;

class Convertdays {
    public void convert(int day) {
        int yr, month, rday;
        yr = day / 365;
        rday = day % 365;
        month = rday / 30;
        rday = rday % 30;
        System.out.println(+day + " days = " + yr + " years ," + month + " months and " + rday + " days ");

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        int d = sc.nextInt();
        Convertdays r = new Convertdays();
        r.convert(d);

    }
}