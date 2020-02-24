public class a3q6{
	public static < T >int count( T[] array,T item)
	{
		int c=0;
		for(int i=0; i<array.length; i++){
			if(array[i].equals(item))
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		Integer a[]={1,2,3,4,5,1};
		Double b[]={2.0,3.0,4.0,5.0,3.0};
		
		System.out.println(count(a,1));
		System.out.println(count(b,2.0));
	}

}