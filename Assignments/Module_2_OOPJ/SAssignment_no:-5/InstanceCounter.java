package Demo;
class Counter{
	private static int count;
	
	public Counter( ) {
		Counter.count = Counter.count + 1;
	}
	public static int getCount() {
		return count;
	}
}
public class InstanceCounter {
	public static void main(String[] args) {
	System.out.println("Instance Counter	:	"+Counter.getCount());
	
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	Counter c3 = new Counter();
	
	System.out.println("Instance Counter	:	"+Counter.getCount());

	}
}
