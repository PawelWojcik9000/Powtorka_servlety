package dzien_1_kolekcje_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {
		Map<String, Country> showMap = new HashMap<>();
		System.out.println(getMap(initialize()));

	}
	
	public static List<Country> initialize() {
		List<Country> countries = new ArrayList<>();
		Country niemcy = new Country("Niemcy");
		Country polska = new Country("Polska");
		Country usa = new Country("USA");
		Country hiszpania = new Country("Hiszpania");
		Country wlochy = new Country("Włochy");
		countries.add(niemcy);
		countries.add(polska);
		countries.add(usa);
		countries.add(hiszpania);
		countries.add(wlochy);
		return countries;
	}
	
	public static Map<String, Country> getMap (List<Country> list) {
		Map<String, Country> countries = new HashMap<>();		
		countries.put("Berlin", initialize().get(0));
		countries.put("Warszawa", initialize().get(1));
		countries.put("Waszyngton", initialize().get(2));
		countries.put("Madryt", initialize().get(3));
		countries.put("Rzym", initialize().get(4));
		return countries;
	}

}
