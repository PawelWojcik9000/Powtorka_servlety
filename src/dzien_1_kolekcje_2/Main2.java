package dzien_1_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main2 {

	public static void main(String[] args) {
		Map<String, String> opposites = new HashMap<>();
		opposites = getMap();
		System.out.println(opposites);
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.println("Podaj odp na zasadzie przeciwienstw");
		for(String key : opposites.keySet()) {
			System.out.println(key+" = ?");
			String str = scan.nextLine();			
			if(str.equals(opposites.get(key))) {
				System.out.println("Dobrze, dostajesz punkt");
				count++;
			} else {
				System.out.println("Zle, nie dostajesz punktu");
			}
		}
		scan.close();
		System.out.println("Ilosc poprawnych odp: "+count);
	}

	public static Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>();
		map.put("cieplo", "zimno");
		map.put("jasno", "ciemno");
		map.put("grubo", "cienko");
		map.put("duzo", "malo");
		map.put("czysto", "brudno");
		return map;
	}

}
