package dzien_1_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		System.out.println(list);
		removeDivider(list, 2);
		System.out.println(list);

	}
	
	public static List<Integer> removeDivider (List<Integer> list, int divider) {
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			if(it.next()%divider==0) it.remove(); 
		}
		return list;
	}

}
