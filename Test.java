import java.util.*;

class A {
    int c;

    void add(int a, int b) {

        c = a + b;
        System.out.println("Sum = " + c);
    }

    void sub(int a, int b) {

        c = a - b;
        System.out.println("Sub = " + c);
    }
}

class B extends A {
    void mult(int a, int b) {

        c = a * b;
        System.out.println("Sub= " + c);
    }

    void div(int a, int b) {

        c = a / b;
        System.out.println("Div = " + c);
    }
}

class C extends B {
    void rem(int a, int b) {

        c = a % b;
        System.out.println("DIv = " + c);
    }
}

class Test {
    public static void main(String args[]) {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        C r = new C();

        r.add(no1, no2);
        r.sub(no1, no2);
        r.mult(no1, no2);
        r.div(no1, no2);
        r.rem(no1, no2);

    }

}