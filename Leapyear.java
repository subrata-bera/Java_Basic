import java.util.*;

class Leapyear {
    public void Lpyr(int yr) {
        if (yr % 100 == 0) {
            if (yr % 400 == 0)
                System.out.println(+yr + " is Leap year");
            else
                System.out.println(+yr + " is not Leap year");
        } else {
            if (yr % 4 == 0)
                System.out.println(+yr + " is leap year");
            else
                System.out.println(+yr + " is not Leap year");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year to check it is Leap year or not");
        int year = sc.nextInt();
        Leapyear r = new Leapyear();
        r.Lpyr(year);
    }
}