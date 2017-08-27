package dzien_1_kolekcje_2;

import java.util.HashSet;
import java.util.Scanner;



public class Main1 {

	public static void main(String[] args) {
		boolean finished = false;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		HashSet<String> myHashSet = new HashSet<>();
		while(!finished) {
			System.out.println("Napis od dodania: ");
			String str = scan.nextLine();
			if(str.equals("exit")) {
				finished = true;
				System.out.println("Podanych napisow: "+count+" | Rozmiar kolekcji: "+myHashSet.size());
			}
			else {
				myHashSet.add(str);
				count++;
			}
		}
		scan.close();

	}

}
