package problem22;

import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.valueOf;
import static java.util.Collections.sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameMagic {

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private final List<String> names;
	private final List<Character> alpha = characterArray(ALPHABET);

	public NameMagic(File file) throws FileNotFoundException {
		names = loadNames(file);
	}

	public int sum() {
		BigInteger sum = ZERO;
		for(String name:names){
			int product = nameValue(name) * (1+names.indexOf(name));
			sum = sum.add(valueOf(product));
		}
		return sum.intValue();
	}

	private int nameValue(String name) {
		int product = 0;
		for(Character character:name.toLowerCase().toCharArray()){
			product += alpha.indexOf(character)+1;
		}
		return product;
	}

	private List<Character> characterArray(String string) {
		List<Character> characters = new ArrayList<Character>();
		for(Character character:string.toCharArray()){
			characters.add(character);
		}
		return characters;
	}
	
	private List<String> loadNames(File file) throws FileNotFoundException {
		List<String> names = new ArrayList<String>();
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter(",");
		while(scanner.hasNext()){
			names.add(scanner.next().replaceAll("\"", "").trim());
		}
		scanner.close();
		sort(names);
		return names;
	}
	
}
