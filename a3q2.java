import java.util.Scanner;
public class a3q2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		try {
			String a[]= {"Black", "Blue","Green","Null", "Red"};
			System.out.println("Input colour 0-4");
			int x= sc.nextInt();
			System.out.println("Your colour length is "+a[x].length());
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
