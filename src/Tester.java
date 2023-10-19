import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno, marks 1, marks 2, marks 3");
		s1.acceptInfo(sc.nextInt(),sc.nextInt() , sc.nextInt(), sc.nextInt());
		s1.display();

	}

}
