import java.util.*;

class A {
    int c;

    void add(int a1, int b1) {
        c = a1 + b1;
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

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        C r = new C();
       

        r.add(a,b);
        r.sub(a,b);
        r.mult(a,b);
        r.div(a,b);
        r.rem(a,b);

    }

}