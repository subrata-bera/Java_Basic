import java.util.*;

class student {
	int roll;
	Double marks;
	String name;

	void input(int r, Double m, String n) {

		roll = r;
		marks = m;
		name = n;
	}
}

class akash extends student {
	void display() {

		System.out.println(+roll + " " + name + " " + marks);
	}
}

class Student_roll_marks {
	public static void main(String args[]) {
		int roll;
		Double marks;
		String name;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter  name ");
		name = Sc.nextLine();
		System.out.println("Enter roll : ");
		roll = Sc.nextInt();
		System.out.println("Enter marks : ");
		marks = Sc.nextDouble();

		akash ob = new akash();
		ob.input(roll, marks, name);
		ob.display();
	}
}