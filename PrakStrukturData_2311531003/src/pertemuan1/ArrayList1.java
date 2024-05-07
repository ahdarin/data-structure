package pertemuan1;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//size arraylist
		int n = 5;
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		for (int i=1; i<=n; i++) 
			arrli.add(i);
		System.out.println(arrli);
		
		//hapus element index 3
		arrli.remove(3);
		System.out.println(arrli);
		
		//print elemen satu  persatu
		for (int i=0; i<arrli.size(); i++)
			System.out.print(arrli.get(i)+ " ");

	}

}
