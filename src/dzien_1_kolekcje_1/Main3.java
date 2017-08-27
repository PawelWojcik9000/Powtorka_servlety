package dzien_1_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<City> city = initialize();
		System.out.println(city.toString());
		
		System.out.println(city.subList(1, 3));
	}
	
	public static List<City> initialize() {
		City warsaw = new City("Warsaw", 3000000);
		City newyork = new City("New York", 14000000);
		City berlin = new City("Berlin", 5000000);
		City amsterdam = new City("Amsterdam", 2000000);
		City wiena = new City("Wiena", 2000000);
		List<City> cities = new ArrayList<>();
		cities.add(warsaw);
		cities.add(newyork);
		cities.add(berlin);
		cities.add(amsterdam);
		cities.add(wiena);
		return cities;
	}

	public static List<City> sublist(List<City> list, int start, int end ) {
		List<City> sublist = list.subList(start, end);
		return sublist;
	}
}
