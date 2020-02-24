import java.util.Scanner;
class MarksOutOfBoundException extends RuntimeException{
	MarksOutOfBoundException(String a){
		super(a);
	}
}
public class a3q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  name: ");
	String name=sc.next();
	System.out.println("Enter marks: ");
	int m=sc.nextInt();
	try {
	
	if(m>100) {
		throw new MarksOutOfBoundException("Incorrect Mark");
	}
	else {
		System.out.println("Your mark is "+m);
	}

	}
catch(MarksOutOfBoundException e) {
	System.out.println(e);
}
}
}