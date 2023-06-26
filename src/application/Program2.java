package application;

import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStr = Arrays.asList("Rafael", "Jesus", "Veronica");
		printList(myStr);
	}

	public static void printList(List<?> list) {
		// Nao podemos adicionar dados a um coleção de tpos coringas
		// list.add(3);
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}