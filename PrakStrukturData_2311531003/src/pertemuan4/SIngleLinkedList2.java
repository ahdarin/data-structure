package pertemuan4;
import java.util.LinkedList;
public class SIngleLinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(42);
		list.add(-3);
		list.add(17);
		System.out.println("LinkedList: " + list);
		Object[] a = list.toArray();
		System.out.print("After converted LinkedList to Array: ");
		for (Object element : a)
			System.out.println(element+" ");
	}

}
