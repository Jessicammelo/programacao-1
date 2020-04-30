package exer3;

import java.lang.reflect.Array;
import java.util.Arrays;

//Jéssica Melo
public class Principal {

	public static void main(String[] args) {
		char[] a = "Jéssica Melo".toCharArray();
		System.out.println(Arrays.toString(a));
		String[] s = new String[3];
		s[0] = "João Aparecido da Silva";
		s[1] = "Dores";
		s[2] = "Blumenau";
		
		
		System.out.println(NameGenerator.generateStarWarsName(s));

	}

}
