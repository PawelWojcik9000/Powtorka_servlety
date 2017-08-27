package dzien_1_kolekcje_1;

public class City {
	private String name;
	private int population;
	
	public City(String name, int population) {
	
		this.name = name;
		this.population = population;
	}

	public City() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + "]";
	}
	
	
}
