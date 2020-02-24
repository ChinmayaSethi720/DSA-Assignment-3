public class a3q5{
	public static < E > void printArray( E[] inputArray)
	{
		for(E i:inputArray)
			System.out.println(i);
	}

	public static void main(String[] args) {
		
		Integer a[]={1,2,3,4,5};
		Double a1[]={1.5,1.6,1.7,1.8};
		String a3[]={"hello","iter"};
		printArray(a);
		printArray(a1);
		printArray(a3);
	}

}