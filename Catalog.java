package curs11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();

		map.put("Elena", 9);
		map.put("Florin", 10);
		map.put("Smaralda", 8);

		System.out.println("Introdu numele: " );
		String nume = scan.next();
		nume = nume.substring(0, 1).toUpperCase() + nume.substring(1);

		System.out.println("Introdu nota: ");
		int nota = scan.nextInt();

		if (!map.containsKey(nume)) {
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			map.put(nume, nota);
		} else if (map.containsKey(nume) && nota <= map.get(nume)) {
			System.out.println("Nu ai nevoie de alta nota");
		} else {
			map.put(nume, nota);
		}
	}

}