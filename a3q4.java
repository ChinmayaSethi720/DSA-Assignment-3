class Box <T>{
	T x;
	Box(T a)
	{
		x=a;
	}
	T get()
	{
		return x;
	}
	void Set(T b) {
		x=b;
	}
}
public class a3q4 {

	public static void main(String[] args) {
		Box <String> b1=new Box<String>("Hello");
		System.out.println(b1.get());
		Box<String>b2=b1;
		b1.Set("ITER");
		System.out.println(b1.get());
		System.out.println(b2.get());
		
		Box <Integer> b3= new Box<Integer>(10);
		System.out.println(b3.get());
		Box<Integer>b4=b3;
		b3.Set(20);
		System.out.println(b3.get());
		System.out.println(b4.get());
		
		
		Box <Object> b5= new Box<Object>(12.5);
		System.out.println(b5.get());
		Box<Object>b6=b5;
		b5.Set(20.5);
		System.out.println(b5.get());
		System.out.println(b6.get());
		
	
	}

}
		