package dzien_1_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) {
			list.add(i+10);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------");
		for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println("---------");
		for(Integer value : list) {
			System.out.println(value);
		}
		System.out.println("END");
		

	}

}
