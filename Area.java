import java.util.*;

class Area {
    public void star(int l, int r) {
        int a, p;
        a = l * r;
        p = 2 * (l + r);
        System.out.println("Area of Rectriangle  = " + a);
        System.out.println("Perimeter of rectriangle = " + p);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thw height and width of a rectriangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Area r = new Area();
        r.star(a, b);

    }
}
