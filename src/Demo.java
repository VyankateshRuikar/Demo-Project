import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(1);
		list.add("Tiny");
		list.add(2);
		list.add("Mini");
		
		System.out.println(list);
		System.out.println(list.get(1));
	}
}

