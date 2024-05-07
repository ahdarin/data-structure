package pertemuan1;

import java.util.ArrayList;

public class ArrayListSisip {

	public static void main(String[] args) {
		ArrayList<Integer> list  = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		System.out.println(list);
		list.add(2,3);
		/*list.add(posisi index elemen yang akan disisipkan, elemen)
		* berarti 3 akan diletakkan di posisi index 2
		* elemen lain setelahnya digeser ke kanan (index+1)
		*/
		System.out.println(list);

	}

}
