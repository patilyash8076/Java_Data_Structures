package Queue_implementation;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue_basic qu=new Queue_basic();
		qu.isEmpty();
		qu.enqueue(5);
		qu.enqueue(34);
		qu.enqueue(2);
		qu.enqueue(43);
		qu.enqueue(40);
	//	qu.enqueue(95);
		//qu.enqueue(89);
		qu.dequeue();
		qu.isEmpty();
		qu.show();
			
	
	}
}
